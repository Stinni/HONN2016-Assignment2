package is.ru.honn.rutube.service;

import org.junit.Before;
import org.junit.Test;

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
        _vService = new VideoServiceStub(_uService);
    }

    @Test
    public void testAddUser() throws Exception {

    }

    @Test
    public void testGetUser() throws Exception {

    }

    @Test
    public void testGetUsers() throws Exception {

    }
}
