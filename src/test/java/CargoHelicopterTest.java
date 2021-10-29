import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CargoHelicopterTest {

    private CargoTransport heli;

    @BeforeEach
    public void setUp(){
        heli = new CargoHelicopter();
    }

    @Test
    public void whenLoad100CargoSize100(){
        for (int i = 0; i < 100; i++) {
            heli.load(new Cargo("Cargo "+i, 150,150,200,5.5));
        }
        int expectedSize = 100;
        int actualSize = heli.cargoCount();
        assertEquals(expectedSize, actualSize);
    }
    @Test
    public void whenLoad100CargoThenUnload100Size0(){
        List<Cargo> cargoArr = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            cargoArr.add(new Cargo("Cargo "+i, 150,150,200,5.5));
        }
        for (Cargo cargo: cargoArr){
            heli.load(cargo);
        }
        for (Cargo cargo: cargoArr){
            heli.unload(cargo);
        }
        int expectedSize = 0;
        int actualSize = heli.cargoCount();
        assertEquals(expectedSize, actualSize);
    }
}