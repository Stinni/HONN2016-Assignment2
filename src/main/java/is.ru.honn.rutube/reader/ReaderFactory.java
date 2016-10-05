package is.ru.honn.rutube.reader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Snojo on 05/10/16.
 */



public class ReaderFactory {
    ApplicationContext resource = new FileSystemXmlApplicationContext("/src/test/resources/spring-config.xml");
    //Create beans to make readers.
    public Reader getReader(String id){
        Reader r = (Reader)resource.getBean(id);
        return r;
    }
}
