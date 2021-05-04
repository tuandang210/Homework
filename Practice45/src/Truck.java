public class Truck extends Vehicle{
    private double payload;

    public Truck(){
    }

    public Truck(double payload) {
        this.payload = payload;
    }

    public Truck(String manufacturer, int yearOfManufacture, double price, String color, double payload) {
        super(manufacturer, yearOfManufacture, price, color);
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return super.toString() +
                "payload=" + payload +
                '}';
    }
}
