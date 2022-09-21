import java.util.ArrayList;

public class BusStop {

    private ArrayList<Person> queue;

    public BusStop() {
        this.queue = new ArrayList<>();
    }

    public void addPersonToQueue(Person person) {
        this.queue.add(person);
    }


    public Person removePersonFromQueue(Person person) {
         this.queue.remove(person);
         return person;
    }

    public int getQueueCount() {

        return this.queue.size();

    }


}
