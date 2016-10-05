package is.ru.honn.rutube.service;

import is.ru.honn.rutube.domain.ServiceException;
import is.ru.honn.rutube.domain.User;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * Hönnun og Smíði Hugbúnaðar - Assignment 2, Part 1:
 * Unit test class TestUserService (TestUserService.java)
 * for the UserService (UserService.java) class
 *
 * @author Kristinn Heiðar Freysteinsson & Snorri Hjörvar Jóhannsson
 * @version 1, 30.09.16
 */
public class TestUserService extends TestCase {
    private UserServiceStub _uService;
    ApplicationContext resource = new FileSystemXmlApplicationContext("/src/test/resources/spring-config.xml");

    @Before
    public void setUp() throws Exception {
        _uService = new UserServiceStub();
        User u = (User)resource.getBean("user");
        _uService.addUser(u);
    }

    @Test
    public void testAddUser() throws Exception {
        User u2 = (User)resource.getBean("user2");
        _uService.addUser(u2);
        assertEquals(54321, _uService.getUser(54321).getUserId());
    }

    @Test
    public void testErrorAddUser() throws Exception {
        User u = (User)resource.getBean("user");
        try{
            _uService.addUser(u);
        } catch(ServiceException e){
            assertEquals("User already exists.", e.getMessage());
        }
    }

    @Test
    public void testGetUser() throws Exception {
        User u = _uService.getUser(12345);
        assertEquals("Snorri", u.getFirstName());
    }

    @Test
    public void testSetOperators() throws Exception {
        User nu = new User();
        nu.setFirstName("Boham");
        nu.setLastName("Johnson");
        nu.setUserId(66666);
        _uService.addUser(nu);
        assertEquals("Boham", nu.getFirstName());
        assertEquals("Johnson", nu.getLastName());
        assertEquals(66666, nu.getUserId());
    }
}
