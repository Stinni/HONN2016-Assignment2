package is.ru.honn.rutube.reader;

/**
 * Created by Snojo on 05/10/16.
 */
public class ReadHandlerStub implements ReadHandler {

    private ReaderFactory factory;
    private Reader reader;

    public ReadHandlerStub() {
        factory = new ReaderFactory();
        reader = factory.getReader("userReader");
        reader.setReadHandler(this);
    }

    @Override
    public void handleObject(int count, Object object) {
        //Reader kallar á þetta til að skila gögnum
        //Prenta gögn(liður 3)
        System.out.println(reader.read());
    }

    public void read() {
        //Reader kallar á þetta til að skila gögnum
        //Prenta gögn(liður 3)
        System.out.println(reader.read());
    }

    public static void main(String args[]){
        ReadHandlerStub s = new ReadHandlerStub();
        s.read();
    }
}
