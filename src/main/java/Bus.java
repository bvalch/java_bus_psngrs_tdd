import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> psng;

    public Bus(String destination){
        this.capacity=3;
        this.psng = new ArrayList<>();
    }

    public int getPsngrs(){
        return this.psng.size();
    }

    public String addPsngr(Person person){
        if(this.psng.size()<this.capacity){
            this.psng.add(person);
        }
        return "Too many";

    }

    public void removePsngr(Person person){
        this.psng.remove(person);
    }

    public void PickUp(BusStop busstop,Person person){
        this.psng.add(busstop.removePersonFromQueue(person));
    }
}
