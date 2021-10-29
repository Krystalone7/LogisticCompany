import java.util.LinkedList;
import java.util.List;

public class PassengerBus extends PassengerTransport{

    private final List<Passenger> passengers = new LinkedList<>();

    @Override
    public void go() {
        System.out.println("Passenger bus started to go with " + passengersCount() + " passengers");
    }

    @Override
    public void put(Passenger passenger) {
        passengers.add(passenger);
        System.out.println("Passenger " + passenger + " got on passenger bus");
    }

    @Override
    public void drop(Passenger passenger) {
        if(passengers.contains(passenger)){
            passengers.remove(passenger);
            System.out.println("Passenger " + passenger + " got off from the passenger bus");
        }
        else{
            System.out.println("Passenger " + passenger + " does not exist on the bus");
        }
    }

    @Override
    public int passengersCount() {
        return passengers.size();
    }
}
