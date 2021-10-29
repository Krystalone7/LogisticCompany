import java.util.LinkedList;
import java.util.List;

public class PassengerHelicopter extends PassengerTransport{
    private final List<Passenger> passengers = new LinkedList<>();

    @Override
    public void go() {
        System.out.println("Passenger helicopter started to go");
    }

    @Override
    public void put(Passenger passenger) {
        passengers.add(passenger);
        System.out.println("Passenger" + passenger + " got on passenger helicopter");
    }

    @Override
    public void drop(Passenger passenger) {
        if(passengers.contains(passenger)){
            passengers.remove(passenger);
            System.out.println("Passenger " + passenger + " got off from the passenger helicopter");
        }
        else{
            System.out.println("Passenger " +passenger + " does not exist on the helicopter");
        }
    }

    @Override
    public int passengersCount() {
        return passengers.size();
    }
}
