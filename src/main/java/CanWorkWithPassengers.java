public interface CanWorkWithPassengers {
    void put(Passenger passenger);
    void drop(Passenger passenger);
    int passengersCount();
}
