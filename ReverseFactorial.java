public class ReverseFactorial {

    public static void main(String[] args){
        reverseFactorial(3628800);
        reverseFactorial(479001600);
        reverseFactorial(6);
        reverseFactorial(18);
    }

    public static void reverseFactorial(int num){
        int i = 1;
        double sum = num;
        while (sum > 1) {
            i++;
            sum = sum / i;
        }
        if (sum == 1){
            System.out.println(num + " = " + i + "!");
        } else {
            System.out.println(num + " NONE");
        }
    }
}
