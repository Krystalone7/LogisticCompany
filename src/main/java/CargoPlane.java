import java.util.LinkedList;
import java.util.List;

public class CargoPlane extends CargoTransport{
    private final List<Cargo> cargoArr = new LinkedList<>();

    @Override
    public void go() {
        System.out.println("Cargo plane started to go");
    }

    @Override
    public void load(Cargo cargo) {
        cargoArr.add(cargo);
        System.out.println("Cargo - " + cargo + " was loaded on the plane");
    }

    @Override
    public void unload(Cargo cargo) {
        if(cargoArr.contains(cargo)){
            System.out.println("Cargo - " + cargo + " was unloaded from the plane");
            cargoArr.remove(cargo);
        }
        else{
            System.out.println(cargo + " does not exist on the plane");
        }
    }

    @Override
    public int cargoCount() {
        return cargoArr.size();
    }
}
