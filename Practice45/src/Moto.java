public class Moto extends  Vehicle{
    private String cylinderCapacity;

    public Moto() {
    }

    public Moto(String cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public Moto(String manufacturer, int yearOfManufacture, double price, String color, String cylinderCapacity) {
        super(manufacturer, yearOfManufacture, price, color);
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(String cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                "cylinderCapacity='" + cylinderCapacity + '\'' +
                '}';
    }
}
