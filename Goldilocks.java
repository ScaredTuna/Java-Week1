public class Goldilocks {

    public static void main(String[] args){
        int goldiWeight = 100;
        int maxTemp = 120;
        int[] chairCapacities = {297, 66, 257, 276, 280, 219, 254, 86, 206, 71, 104, 238, 52, 129, 144, 157, 210, 11,
                268, 261, 12, 186, 174, 77, 54, 174, 16, 59, 290, 248};
        int[] porridgeTemps = {90, 110, 113, 191, 129, 163, 193, 153, 147, 137, 40, 127, 146, 197, 59, 124, 59, 54,
                119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132};
        for (int i = 0; i < chairCapacities.length; i++){
            boolean weightCheck = checkWeight(chairCapacities[i], goldiWeight);
            boolean tempCheck = checkTemp(porridgeTemps[i], maxTemp);
            if (weightCheck && tempCheck){
                System.out.print(i + 1 + " ");
            }
        }
    }

    public static boolean checkWeight(int chairCapacity, int goldiWeight){
        if(chairCapacity >= goldiWeight){
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkTemp(int porridgeTemp, int maxTemp){
        if(porridgeTemp <= maxTemp){
            return true;
        } else {
            return false;
        }
    }
}
