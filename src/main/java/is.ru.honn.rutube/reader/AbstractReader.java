package is.ru.honn.rutube.reader;

/**
 * Created by krihf on 4.10.2016.
 */
public abstract class AbstractReader implements Reader {

    private ClientRequest clientRequest;

    public AbstractReader() {
        clientRequest = new ClientRequest();
    }

    public Object read() {
        return clientRequest.getRequest("http://mockaroo.com/f13b8200/download?count=1&key=e79a3650");
    }

    //public abstract Object parse(String content);


    public void setURI(String URI) {

    }

    public void setReadHandler(ReadHandler readHandler) {

    }
}
