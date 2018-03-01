import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Garage {
    List<Vehicle> vehicleList = new LinkedList<Vehicle>();
    int noStoredVehicles;

    public int calculateBill(){
        int totBill = 0;
        for (Vehicle v:vehicleList){
            totBill += v.cost();
        }
        return totBill;
    }

    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
        noStoredVehicles++;
    }

    public void removeVehicle(String regNo){
        Iterator<Vehicle> it = vehicleList.iterator();
        while (it.hasNext()){
            if (it.next().regNo.equals(regNo)){
                it.remove();
                noStoredVehicles--;
            }
        }
    }

    public void removeVehicle(Vehicle vehicle) {
        Iterator<Vehicle> it = vehicleList.iterator();
        while (it.hasNext()){
            if (it.next().getClass().equals(vehicle.getClass())){
                it.remove();
                noStoredVehicles--;
            }
        }
    }

    public void emptyGarage(){
        vehicleList = new LinkedList<Vehicle>();
        noStoredVehicles = 0;
    }

    public void listContents(){
        System.out.println("Contents of Garage: " + noStoredVehicles + " Vehicles");
        System.out.println(toString());
    }

    public int vehicleCost(int index){
        return vehicleList.get(index - 1).cost();
    }

    @Override
    public String toString(){
        String output = "";
        for (Vehicle v : vehicleList){
            output += "\n";
            output += v + "\n" ;

        }
        return output;
    }
}
