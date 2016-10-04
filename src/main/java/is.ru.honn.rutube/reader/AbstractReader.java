package is.ru.honn.rutube.reader;

/**
 * Created by krihf on 4.10.2016.
 */
public abstract class AbstractReader implements Reader, ReadHandler {

    public Object read() {

    }

    public abstract Object parse(String content);


    public void setURI(String URI) {

    }

    public void setReadHandler(ReadHandler readHandler) {

    }
}
