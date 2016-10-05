package is.ru.honn.rutube.reader;

import org.json.simple.JSONObject;

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

    public Object read() {
        return parse(clientRequest.getRequest(URI));
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    public void setReadHandler(ReadHandler readHandler) {
        this.readHandler = readHandler;
    }

    /**
     *
     * @param jParent Json parent containing an integer field.
     * @param name name of the integer field
     * @return int value of the json int in the jParent object.
     */
    protected int getInt(JSONObject jParent, String name)
    {
        if(jParent == null)
            return 0;
        Long value = (Long)jParent.get(name);
        if(value == null)
            return 0;
        return value.intValue();
    }
}
