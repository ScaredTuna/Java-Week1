package src;

public class Exercise1 {

    public static void main(String[] args) {
        System.out.println(blackJack(18, 21));
        System.out.println(blackJack(20, 18));
        System.out.println(blackJack(22, 22));
    }

    // Method that returns the closest value to 21 that is not greater than 21
    public static int blackJack(int a, int b) {
        int c = 0;
        if (a > 0 && a < 22) {
            c = a;
        }
        if (b > 0 && b < 22) {
            if (b > c) {
                c = b;
            }
        }
        return c;
    }
}
