public class Van extends Vehicle{
    private int storageSpace;
    public static int noVans;

    public Van(int storageSpace, String regNo, String make, String colour, int noWheels) {
        super(regNo, make, colour, noWheels);
        this.storageSpace = storageSpace;
        noVans++;
    }

    @Override
    public int cost(){
        return 400;
    }

    @Override
    public String toString() {
        String output = "Vehicle Type: Van";
        output += "\nStorage Space:" + storageSpace;
        output += "\nRegistration Number: " + regNo;
        output += "\nMake: " + make;
        output += "\nColour: " + colour;
        return output;
    }
}
