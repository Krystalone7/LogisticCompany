import java.util.LinkedList;
import java.util.List;

public class CargoHelicopter extends CargoTransport{
    private final List<Cargo> cargoArr = new LinkedList<>();

    @Override
    public void go() {
        System.out.println("Cargo helicopter started to go");
    }

    @Override
    public void load(Cargo cargo) {
        cargoArr.add(cargo);
        System.out.println("Cargo - " + cargo + " was loaded on the helicopter");
    }

    @Override
    public void unload(Cargo cargo) {
        if(cargoArr.contains(cargo)){
            System.out.println("Cargo - " + cargo + " was unloaded from the helicopter");
            cargoArr.remove(cargo);
        }
        else{
            System.out.println("Cargo - " + cargo + " does not exist on the helicopter");
        }
    }

    @Override
    public int cargoCount() {
        return cargoArr.size();
    }
}
