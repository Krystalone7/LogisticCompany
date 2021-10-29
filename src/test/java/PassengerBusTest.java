import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Driver;

import static org.junit.jupiter.api.Assertions.*;

class PassengerBusTest {
    private PassengerTransport bus;

    @BeforeEach
    public void setUp(){
        bus = new PassengerBus();
    }


}