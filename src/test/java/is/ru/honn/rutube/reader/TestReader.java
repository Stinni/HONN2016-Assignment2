package is.ru.honn.rutube.reader;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Hönnun og Smíði Hugbúnaðar - Assignment 2, Part 1:
 * Unit test class TestReader (TestReader.java)
 * for the Reader package
 *
 * @author Kristinn Heiðar Freysteinsson & Snorri Hjörvar Jóhannsson
 * @version 1, 4.10.16
 */
public class TestReader implements ReadHandler {

    private ReaderFactory factory;
    private Reader reader;

    @Before
    public void setUp() throws Exception {
        factory = new ReaderFactory();
        //reader.setReadHandler(this);
    }

    @Override
    public void handleObject(int count, Object object) {

    }

    @Test
    public void testFactory() {
        reader = factory.getReader("userReader");
        Object obj = reader.read();
        //assertEquals();
    }

    /*
    Test the reader
    ●	Factory reads the readers.xml correctly
    ●	Exception if URI is wrong
    ●	Exception if handler is not set
    ●	Check the number of lines read matches with file
    */

    // Filepath: "/src/test/resources/T-302-HONN 2016 Assignment 2.json"
}
