public class Car extends Vehicle{
    private String carType;
    public static int noCars;

    public Car(String carType, String regNo, String make, String colour){
        super(regNo, make, colour, 4);
        this.carType = carType;
        noCars++;
    }

    @Override
    public int cost(){
        return 250;
    }

    @Override
    public String toString(){
        String output = "Vehicle Type: Car - " + carType;
        output += "\nRegistration Number: " + regNo;
        output += "\nMake: " + make;
        output += "\nColour: " + colour;
        return output;
    }

}
