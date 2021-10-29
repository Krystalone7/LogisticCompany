public class Cargo {
    private String type;
    private double length;
    private double width;
    private double height;
    private double weight;

    @Override
    public String toString() {
        return "type: " + type + "; dimensions: " + length + " x " + width + " x " + height + "; weight: " + weight;
    }

    public Cargo(String type, double length, double width, double height, double weight) {
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
}
