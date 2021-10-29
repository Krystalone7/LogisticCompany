import java.util.LinkedList;
import java.util.List;

public class PassengerPlane extends PassengerTransport{
    private final List<Passenger> passengers = new LinkedList<>();

    @Override
    public void go() {
        System.out.println("Passenger plane started to go");
    }

    @Override
    public void put(Passenger passenger) {
        passengers.add(passenger);
        System.out.println(passenger + " got on passenger plane");
    }

    @Override
    public void drop(Passenger passenger) {
        if(passengers.contains(passenger)){
            passengers.remove(passenger);
            System.out.println("Passenger" + passenger + "got off passenger plane");
        }
        else{
            System.out.println("Passenger" + passenger + "does not exist on the plane");
        }
    }

    @Override
    public int passengersCount() {
        return passengers.size();
    }
}
