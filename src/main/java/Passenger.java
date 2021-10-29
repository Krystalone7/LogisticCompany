public class Passenger {
    private String name;
    private String surname;

    @Override
    public String toString() {
        return surname + " " + name;
    }

    public Passenger(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
