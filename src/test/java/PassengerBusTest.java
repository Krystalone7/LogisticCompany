import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PassengerBusTest {
    private PassengerTransport bus;

    @BeforeEach
    public void setUp(){
        bus = new PassengerBus();
    }

    @Test
    public void whenPut50PassengersSize50(){
        for (int i = 0; i < 50; i++) {
            bus.put(new Passenger("PassengerName"+i , "Surname"+i));
        }
        int expectedSize = 50;
        int actualSize = bus.passengersCount();
        assertEquals(expectedSize, actualSize);
    }
    @Test
    public void whenPut100PassengersThenDrop100Size0(){
        List<Passenger> passengers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            passengers.add(new Passenger("PassengerName"+i , "Surname"+i));
        }
        for (Passenger passenger: passengers){
            bus.put(passenger);
        }
        for (Passenger passenger: passengers){
            bus.drop(passenger);
        }
        int expectedSize = 0;
        int actualSize = bus.passengersCount();
        assertEquals(expectedSize, actualSize);
    }
}