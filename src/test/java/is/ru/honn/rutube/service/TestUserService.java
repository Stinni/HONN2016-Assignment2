package is.ru.honn.rutube.service;

import is.ru.honn.rutube.domain.User;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * Created by Snojo on 30/09/16.
 */
public class TestUserService extends TestCase {
    private UserServiceStub _uService;

    @Before
    public void setUp() throws Exception {
        ApplicationContext resource = new FileSystemXmlApplicationContext("/src/spring-config.xml");
        _uService = new UserServiceStub();
        User u = (User)resource.getBean("user");
        _uService.addUser(u);
        System.out.println(u.getFirstName());
    }

    @Test
    public void testAddUser() throws Exception {
        assertTrue(true);
    }

    @Test
    public void testGetUser() throws Exception {
        User u = _uService.getUser(12345);
        System.out.println(u.getLastName());
        //assertEquals("Snorri", u);
        assertTrue(true);
    }

    @Test
    public void testGetUsers() throws Exception {
        assertTrue(true);
    }
}

/*
package is.ru.honn.rutube.test;

import org.junit.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class is.ru.honn.rutube.service.TestUserService {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    //private SalaryCalculator calculator;

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        //calculator = new SalaryCalculator();
    }

    @Test
    public void test1_ExitsWithExitCode4() throws Exception {
        /*int basePay = 450;
        int hours = 35;
        calculator.calculateSalary(basePay, hours);
        assertEquals("Base pay can't be lower than the minimum wage (500)", outContent.toString());*//*
    }

    @Test
    public void TestAddUser() throws Exception{

    }
}
* */
/**
 * Hönnun og Smíði Hugbúnaðar - Assignment 2, Part 1:
 * Unit test class is.ru.honn.rutube.service.TestUserService (is.ru.honn.rutube.service.TestUserService.java)
 * for the UserService (UserService.java) class
 *
 * @author Kristinn Heiðar Freysteinsson & Snorri Hjörvar Jóhannsson
 * @version 1, 30.09.16
 */