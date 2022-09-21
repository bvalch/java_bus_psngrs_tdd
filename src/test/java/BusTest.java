import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {


    private Bus bus;
    private Person person;
    private BusStop busstop;

    @Before
    public void before() {
        bus = new Bus("Here");
        person = new Person();
        busstop = new BusStop();
    }

    @Test
    public void getNumOfPsngrs() {
        assertEquals(0, bus.getPsngrs());
    }

    @Test
    public void addPsngr() {
        bus.addPsngr(person);
        assertEquals(1, bus.getPsngrs());
    }

    @Test
    public void addPsngrOverCapacity() {
        bus.addPsngr(person);
        bus.addPsngr(person);
        bus.addPsngr(person);
        assertEquals("Too many", bus.addPsngr(person));
    }

    @Test
    public void removePsngr() {
        bus.addPsngr(person);
        bus.removePsngr(person);
        assertEquals(0, bus.getPsngrs());
    }

    @Test
    public void pickUpFromBusStop() {
        busstop.addPersonToQueue(person);
        bus.PickUp(busstop,person);
        assertEquals(1,bus.getPsngrs());
        assertEquals(0,busstop.getQueueCount());

    }
}



