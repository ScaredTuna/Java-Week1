public abstract class Vehicle {
    public String regNo;
    public String make;
    public String colour;
    public int noWheels;
    public static int noVehicles;

    public Vehicle(String regNo, String make, String colour, int noWheels){
        this.regNo = regNo;
        this.make = make;
        this.colour = colour;
        this.noWheels = noWheels;
        noVehicles++;
    }

    public abstract int cost();

}
