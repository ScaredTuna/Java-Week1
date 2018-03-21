package src;

public class Exercise3 {

    public static void main(String[] args) {
        System.out.println("The temperature is in the specified range: " + temp(70, false));
    }

    public static boolean temp(int temperature, boolean isSummer) {
        if (isSummer) {
            if (temperature <= 100 && temperature >= 60) {
                return true;
            } else {
                return false;
            }
        } else {
            if (temperature <= 90 && temperature >= 60) {
                return true;
            } else {
                return false;
            }
        }
    }
}
