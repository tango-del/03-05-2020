package homework.lesson14;

/*
В сервисном центре может быть разное количество колонок с разным
показателем количества (от 0 до 100)
Сервисный центр может заправлять топливо или менять масло если
количество ненулевое. Для этого в качестве параметра надо передать
объект-автомобиль и количество требуемого топлива или масла
*/
public class Service {
    private int[] oilColumn;
    private int[] fuelColumn;

    public Service(int[] fuelColumnm, int[] oilColumn) {
        this.fuelColumn = fuelColumnm;
        this.oilColumn = oilColumn;
    }

    public void fuelColumnInit() {
        for (int i = 0; i < fuelColumn.length; i++) {
            fuelColumn[i] = (int) (Math.random() * 100);
        }
    }

    public void oilColumnInit() {
        for (int i = 0; i < oilColumn.length; i++) {
            oilColumn[i] = (int) (Math.random() * 20);
        }
    }

    public void fillFuel(Car car, int fuelCount) {
        fuelColumnInit();
        if (checkFuelLevel(car)) {
            System.out.println(String.format("Fuel level is empty: %s. Please use teleport....", car.getFuelLevel()));
            car.stop();
        } else {
            for (int i = 0; i < fuelColumn.length; i++) {
                if (fuelColumn[i] > fuelCount) {
                    System.out.println(String.format("Fill fuel: %s", fuelCount));
                    car.addFuel(fuelCount);
                    fuelColumn[i] -= fuelCount;
                    break;
                }
            }
        }
//        int fuelCount1 = car.getFuelLevel();
//        car.setFuelLevel(fuelCount1 += fuelCount); // spaghetti code
    }

    public boolean checkOilLevel(Car car) {
        if (car.getEngineOilLevel() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkFuelLevel(Car car) {
        if (car.getFuelLevel() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void changeOil(Car car, int oilCount) {
        oilColumnInit();
        if (checkOilLevel(car)) {
            System.out.println(String.format("Oil level is empty: %s. Please use teleport...", car.getEngineOilLevel()));
            car.stop();
        } else {
            for (int i = 0; i < oilColumn.length; i++) {
                if (oilColumn[i] > oilCount) {
                    System.out.println(String.format("Fill oil: %s", oilCount));
                }
                car.addOil(oilCount);
                oilColumn[i] -= oilCount;
                break;
            }
        }
    }
}