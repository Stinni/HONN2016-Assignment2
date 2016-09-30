// TODO: move to right folder when service layer is ready!

package is.ru.honn.rutube.service;

import org.junit.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

/**
 * Hönnun og Smíði Hugbúnaðar - Assignment 2, Part 1:
 * Unit test class TestUserService (TestUserService.java)
 * for the UserService (UserService.java) class
 *
 * @author Kristinn Heiðar Freysteinsson & Snorri Hjörvar Jóhannsson
 * @version 1, 30.09.16
 */
public class TestUserService {

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
        assertEquals("Base pay can't be lower than the minimum wage (500)", outContent.toString());*/
    }
}