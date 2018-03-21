package src;

public class Exercise2 {

    public static void main(String[] args) {
        System.out.println(uniqueSum(1, 2, 3));
        System.out.println(uniqueSum(3, 3, 3));
        System.out.println(uniqueSum(1, 1, 2));
    }

    //Method that sums values only if they are not equal to another
    public static int uniqueSum(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != a && c != b) {
            sum +=c;
        }
        return sum;
    }
}
