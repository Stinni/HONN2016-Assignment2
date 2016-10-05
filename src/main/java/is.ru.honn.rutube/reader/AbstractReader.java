package is.ru.honn.rutube.reader;

/**
 * Created by krihf on 4.10.2016.
 */
public abstract class AbstractReader implements Reader {

    private ClientRequest clientRequest;
    private ReadHandler readHandler;
    private String URI;

    public AbstractReader() {
        clientRequest = new ClientRequest();
        URI = "http://mockaroo.com/f13b8200/download?count=1&key=e79a3650";
    }

    public AbstractReader(String uriString) {
        clientRequest = new ClientRequest();
        this.URI = uriString;
    }

    public Object read() {
        return parse(clientRequest.getRequest(URI));
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    public void setReadHandler(ReadHandler readHandler) {
        this.readHandler = readHandler;
    }
}
