package is.ru.honn.rutube.reader;

/**
 * Created by Snojo on 05/10/16.
 */
public class ReadHandlerStub implements ReadHandler {

    public ReadHandlerStub() {
        ReaderFactory factory = new ReaderFactory();
        Reader reader = factory.getReader("videoReaderuserReader"); // breytt 05.10.2016

        reader.setReadHandler(this);
        reader.read();
    }

    public static void main(String args[]){

    }

    @Override
    public void read(int count, Object object) {
        //Reader kallar á þetta til að skila gögnum
        //Prenta gögn(liður 3)


    }
}
