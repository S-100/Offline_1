package TestCar;

/**
 * Created by senjuti on 9/18/2015.
 */
public class TestCar {
    public static void main(String[] args) {
        Driver lewis=new Driver("Lewis Hamilton", 30, "UK");
        lewis.print();

        Driver vettel=new Driver("Sebastian Vettel", 28);
        vettel.setCountry("Germany");
        vettel.print();

        Car c1=new Car("F1 W06", "Mercedes", lewis, 500);
        System.out.println("Name = " + c1.getName());
        System.out.println("Manufacturer = " + c1.getManufacturer());
        System.out.println("Driver = " + c1.getDriver().getName());
        System.out.println("FuelCapacity = " + c1.getFuelCapacity());
        c1.refuel(100);
        c1.drive(400);
        System.out.println("Name = " + c1.getName());
        System.out.println("Manufacturer = " + c1.getManufacturer());
        System.out.println("Driver = " + c1.getDriver().getName());
        System.out.println("FuelCapacity = " + c1.getFuelCapacity());


        Car c2=new Car("SF15-T", "Ferrari");
        c2.setDriver(vettel);
        c2.setFuelCapacity(400);
        c2.print();
        c2.refuel(50);
        c2.drive(500);
        c2.print();

        c1.getDriver().print();
        c2.getDriver().print();


    }

}

