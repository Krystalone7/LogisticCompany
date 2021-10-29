public class Main {
    public static void main(String[] args) {
        CargoTransport heli = new CargoHelicopter();

        Cargo cargo = new Cargo("Bottles", 120, 200,200, 4);
        heli.load(cargo);
        System.out.println(heli.cargoCount());
        heli.go();
        heli.unload(cargo);
        System.out.println(heli.cargoCount());

        PassengerTransport bus = new PassengerBus();
        Passenger passenger1 = new Passenger("Artyom", "Ivanov");
        bus.put(passenger1);
        System.out.println("Колво пассажиров - " + bus.passengersCount());
        bus.go();
        bus.drop(passenger1);
        System.out.println("Колво пассажиров - " + bus.passengersCount());

    }
}
