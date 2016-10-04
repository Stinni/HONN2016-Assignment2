package is.ru.honn.rutube.reader;

/**
 * Created by krihf on 4.10.2016.
 */
public interface Reader
{
    Object read();
    Object parse(String content);
    void setURI(String URI);
    void setReadHandler(ReadHandler readHandler);
}

