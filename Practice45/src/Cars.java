public class Cars extends Vehicle {
    private int numberOfSits;
    private String typeOfEngine;

    public Cars() {
    }

    public Cars(int numberOfSits, String typeOfEngine) {
        this.numberOfSits = numberOfSits;
        this.typeOfEngine = typeOfEngine;
    }

    public Cars(String manufacturer, int yearOfManufacture, double price, String color, int numberOfSits, String typeOfEngine) {
        super(manufacturer, yearOfManufacture, price, color);
        this.numberOfSits = numberOfSits;
        this.typeOfEngine = typeOfEngine;
    }

    public int getNumberOfSits() {
        return numberOfSits;
    }

    public void setNumberOfSits(int numberOfSits) {
        this.numberOfSits = numberOfSits;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numberOfSits=" + numberOfSits +
                ", typeOfEngine='" + typeOfEngine + '\'' +
                '}';
    }
}