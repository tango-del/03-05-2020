package homework.lesson14;

public class Car {
    private String model;
    private int engineType; // 0 - disel, 1 - benzin
    private int fuelLevel; // = 50
    private int engineOilLevel; // = 5
    private int fuelConsumption;
    private int oilConsumption;

    public Car(int fuelConsumption, int oilConsumption) {
        this.fuelConsumption = fuelConsumption;
        this.oilConsumption = oilConsumption;
    }

    public void move(String where) {
        System.out.println(String.format("Fuel level: %s and Oil level: %s", fuelLevel, engineOilLevel));
        if (fuelLevel == 0 || engineOilLevel == 0) {
            System.out.println("Fuel level or Oil level is empty");
            stop();
        } else {
            System.out.println(String.format("Car is moving to %s", where));
            fuelLevel -= fuelConsumption;
            engineOilLevel -= oilConsumption;
            System.out.println(String.format("Fuel level after: %s. Oil level after: %s", fuelLevel, engineOilLevel));
        }
    }

    public void stop() {
        System.out.println("Car stop");
    }

    public void addFuel(int fuelCount) {
        fuelLevel += fuelCount;
    }

    public void addOil(int oilCount) {
        engineOilLevel += oilCount;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setEngineOilLevel(int engineOilLevel) {
        this.engineOilLevel = engineOilLevel;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public int getEngineOilLevel() {
        return engineOilLevel;
    }
}