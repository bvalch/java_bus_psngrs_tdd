import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStoptest {

    private BusStop busstop;
    private Person person;


    @Before
    public void before(){
        busstop = new BusStop();
        person = new Person();
        busstop = new BusStop();


    }
    @Test
    public void addToQueue(){
        busstop.addPersonToQueue(person);
        assertEquals(1,busstop.getQueueCount());
    }
    @Test
    public void removeFromQueue(){
        busstop.addPersonToQueue(person);
        busstop.removePersonFromQueue(person);
        assertEquals(0,busstop.getQueueCount());

    }





}
