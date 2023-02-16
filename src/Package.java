public class Package {
    private Address origin;
    private Address destination;
    private double weight;
    private double length;
    private double width;
    private double height;

    public Package(Address origin, Address destination, double weight, double length, double width, double height){
        this.origin = origin;
        this.destination = destination;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Address getOrigin() {
        return origin;
    }

    public void setOrigin(Address origin) {
        this.origin = origin;
    }

    public Address getDestination() {
        return destination;
    }

    public void setDestination(Address destination) {
        this.destination = destination;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
