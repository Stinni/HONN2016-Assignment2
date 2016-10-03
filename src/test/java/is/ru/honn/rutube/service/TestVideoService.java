package is.ru.honn.rutube.service;

import is.ru.honn.rutube.domain.User;
import is.ru.honn.rutube.domain.Video;
import org.junit.Before;
import org.junit.Test;
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
    private UserServiceStub _uService;
    private VideoServiceStub _vService;

    @Before
    public void setUp() throws Exception {
        _uService = new UserServiceStub();
        _uService.addUser(new User(12345678, "Magnus", "Bjornsson", "meb@ru.is", "MEB", "1975-10-03"));
        _vService = new VideoServiceStub(_uService);
        List<String> tags = new ArrayList<>();
        tags.add("woohoo"); tags.add("woowoo");
        _vService.addVideo(new Video(22222222, "TwoTwoTwo", "Description", "url", "music", tags), 12345678);
    }

    @Test
    public void testAddVideo_test1() throws Exception {
        List<String> tags = new ArrayList<>();
        tags.add("threeeeee");
        _vService.addVideo(new Video(33333333, "ThreeThree", "Description", "url", "music", tags), 12345678);
        assertEquals(33333333, _vService.getVideo(33333333).getVideoId());
    }

    @Test
    public void testGetUser() throws Exception {

    }

    @Test
    public void testGetUsers() throws Exception {

    }
}
