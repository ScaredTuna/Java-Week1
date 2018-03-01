public class Exercise5 {

    public static void main(String[] args) {
        Garage garage = new Garage();
        Vehicle car = new Car("Coupe", "AG54 1PG", "Honda", "Red");
        Vehicle bike = new MotorBike("DirtBike", "GB09 2DE", "Yamaha", "Blue");
        Vehicle van = new Van(80, "RW08 3JK", "Ford", "White", 4);
        Vehicle car2 = new Car("Hatchback", "FD03 2GX", "BMW", "Black");
        Vehicle van2 = new Van(95, "RT58 2DE", "Volvo", "Red", 4);
        Vehicle bike2 = new MotorBike("Chopper", "HY54 8JK", "Harley-Davidson", "Grey");
        garage.addVehicle(car);
        garage.addVehicle(bike);
        garage.addVehicle(van);
        garage.addVehicle(car2);
        garage.addVehicle(van2);

        System.out.println("Total Number of Vehicles: " + Vehicle.noVehicles);
        System.out.println("Total Cars: " + Car.noCars);
        System.out.println("Total MotorBikes: " + MotorBike.noMotorBikes);
        System.out.println("Total Vans: " + Van.noVans);
        System.out.println("Number of Vehicles Stored in Garage: " + garage.noStoredVehicles);
        System.out.println("-----------------------------------");
        System.out.println("Details of Vehicle not in Garage:\n");
        System.out.println(bike2);
        System.out.println("-----------------------------------");
        System.out.println("Total Cost of Vehicles in Garage: " + garage.calculateBill());
        System.out.println("-----------------------------------");
        System.out.println("Cost of Second Vehicle in Garage: " + garage.vehicleCost(2));
        garage.removeVehicle("AG54 1PG");
        System.out.println("-----------------------------------");
        garage.listContents();
        garage.removeVehicle(van);
        System.out.println("-----------------------------------");
        garage.listContents();
        System.out.println("-----------------------------------");
        garage.emptyGarage();
        garage.listContents();
        System.out.println(garage);
    }
}
