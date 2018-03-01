public class MotorBike extends Vehicle {
    private String bikeType;
    public static int noMotorBikes;

    public MotorBike(String bikeType, String regNo, String make, String colour) {
        super(regNo, make, colour, 2);
        this.bikeType = bikeType;
        noMotorBikes++;
    }

    @Override
    public int cost() {
        return 150;
    }

    @Override
    public String toString() {
        String output = "Vehicle Type: MotorBike - " + bikeType;
        output += "\nRegistration Number: " + regNo;
        output += "\nMake: " + make;
        output += "\nColour: " + colour;
        return output;
    }
}
