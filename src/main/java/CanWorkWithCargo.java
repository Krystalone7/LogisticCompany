public interface CanWorkWithCargo {
    void load(Cargo cargo);
    void unload(Cargo cargo);
    int cargoCount();
}
