package TestCar;

/**
 * Created by senjuti on 9/18/2015.
 */
public class Car {
    private String name;
    private String manufacturer;
    private Driver driver;
    private int fuelCapacity;

    public Car(String name, String manufacturer, Driver driver, int fuelCapacity){
        this.name=name;
        this.manufacturer=manufacturer;
        this.driver=driver;
        this.fuelCapacity=fuelCapacity;
    }
    public Car(String name, String manufacturer){
        this.name=name;
        this.manufacturer=manufacturer;
    }
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getName()  {
        return name;
    }

    public Driver getDriver()  {
        return driver;
    }

    public String getManufacturer()  {
        return manufacturer;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }


    public void refuel(int miles) {
        fuelCapacity += miles;
    }

    public void drive(int miles) {
        if (fuelCapacity >= miles) {
            fuelCapacity -= miles;
        }
        else {
            System.out.println("Driving distance exceeds the car's fuel capacity!");
        }
    }

    public void print()  {
        System.out.println("Name = "+this.name+",");
        System.out.println("Manufacturer = "+this.manufacturer+",");
        System.out.println("Driver = "+this.driver.getName()+",");
        System.out.println("FuelCapacity = "+this.fuelCapacity);
    }



}
