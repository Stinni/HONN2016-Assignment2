package is.ru.honn.rutube.service;

import is.ru.honn.rutube.domain.User;
import is.ru.honn.rutube.domain.Video;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krihf on 3.10.2016.
 */
public class TestVideoService {

/*
Test if adding and getting videos works right
●	Add video, userId, title and src
●	Add video that fails
●	Check if getting videos that do not exist works correctly
*/
    ApplicationContext resource = new FileSystemXmlApplicationContext("/src/spring-config.xml");
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
    public void testGetUser() throws Exception {

    }

    @Test
    public void testGetUsers() throws Exception {

    }
}
