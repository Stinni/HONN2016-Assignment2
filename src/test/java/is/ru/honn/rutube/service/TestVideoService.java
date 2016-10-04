package is.ru.honn.rutube.service;

import is.ru.honn.rutube.domain.ServiceException;
import is.ru.honn.rutube.domain.User;
import is.ru.honn.rutube.domain.Video;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by Kristinn Heiðar Freysteinsson & Snorri on 3.10.2016.
 */
public class TestVideoService {

    ApplicationContext resource = new FileSystemXmlApplicationContext("/src/test/resources/spring-config.xml");
    private UserServiceStub _uService;
    private VideoServiceStub _vService;

    @Before
    public void setUp() throws Exception {
        _uService = new UserServiceStub();
        User u = (User)resource.getBean("user");
        _uService.addUser(u);
        _vService = new VideoServiceStub(_uService);
        Video v = (Video)resource.getBean("video1");
        _vService.addVideo(v, u.getUserId());
    }

    @Test
    public void testAddVideo() throws Exception {
        Video v2 = (Video)resource.getBean("video2");
        _vService.addVideo(v2, 12345); // 12345 is the Id of the only user in the test data
        assertEquals("ThreeThreeThreeThree", _vService.getVideo(3333).getTitle());
    }

    @Test
    public void testAddVideoUserNull() throws Exception {
        Video v2 = (Video)resource.getBean("video2");
        try {
            _vService.addVideo(v2, 99999);
        } catch(ServiceException e) {
            assertEquals("User doesn't exist.", e.getMessage());
        }
    }

    @Test
    public void testAddVideoDoubleAndFails() throws Exception {
        Video v = (Video)resource.getBean("video1");
        try {
            _vService.addVideo(v, 12345);
        } catch(ServiceException e) {
            assertEquals("Video already exists.", e.getMessage());
        }
    }

    @Test
    public void testGetVideosByUser() throws Exception {
        List<Video> vids = _vService.getVideosByUser(12345);
        assertEquals(1, vids.size());
        assertEquals("TwoTwoTwoTwo", vids.get(0).getTitle());
    }

    @Test
    public void testGetVideosByNonExistentUser() throws Exception {
        List<Video> vids = _vService.getVideosByUser(99999);
        assertNull(vids);
    }

    @Test
    public void testGetVideo() throws Exception {
        Video v = _vService.getVideo(2222);
        assertEquals("TwoTwoTwoTwo", v.getTitle());
    }

    @Test
    public void testGetNonExistentVideo() throws Exception {
        Video v = _vService.getVideo(9999);
        assertNull(v);
    }
}
