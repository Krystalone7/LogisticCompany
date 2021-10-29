import java.util.LinkedList;
import java.util.List;

public class Truck extends CargoTransport{
    private final List<Cargo> cargoArr = new LinkedList<>();

    @Override
    public void go() {
        System.out.println("Truck started to go");
    }

    @Override
    public void load(Cargo cargo) {
        cargoArr.add(cargo);
        System.out.println("Cargo - " + cargo + " was loaded on the truck");
    }

    @Override
    public void unload(Cargo cargo) {
        if(cargoArr.contains(cargo)){
            System.out.println("Cargo - " + cargo + " was unloaded from the truck");
            cargoArr.remove(cargo);
        }
        else{
            System.out.println("Cargo - " + cargo + " does not exist on the truck");
        }
    }
    @Override
    public int cargoCount() {
        return cargoArr.size();
    }
}
