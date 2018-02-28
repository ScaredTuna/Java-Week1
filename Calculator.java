public class Calculator {

    public static void main(String[] args){
        String input = "4,2,8";
        String input2 = "6,2,12";
        String input3 = "6,2,3";
        String input4 = "9,12,108";
        String input5 = "4,16,64";
        System.out.println(calculate(stringToInt(input)));
        System.out.println(calculate(stringToInt(input2)));
        System.out.println(calculate(stringToInt(input3)));
        System.out.println(calculate(stringToInt(input4)));
        System.out.println(calculate(stringToInt(input5)));
    }

    public static int[] stringToInt(String input){
        String[] parts = input.split(",");
        int[] numbers = new int[parts.length];
        for(int i = 0; i < parts.length; i++){
            numbers[i] = Integer.parseInt(parts[i]);
        }
        return numbers;
    }

    public static String calculate(int[] numbers){
        String output = "";
        int[] current = addition(numbers);
        if (current != null){
            output += current[0] + "+" + current[1] + "=" + current[2];
            output += ", or " + current[2] + "-" + current[0] + "=" + current[1];
            output += ", or " + current[2] + "-" + current[1] + "=" + current[0];
        }
        if (output != ""){
            output += "  ";
        }
        current = multiplication(numbers);
        if (current != null){
            output += current[0] + "*" + current[1] + "=" + current[2];
            output += ", or " + current[2] + "/" + current[0] + "=" + current[1];
            output += ", or " + current[2] + "/" + current[1] + "=" + current[0];
        }
        return output;
    }

    public static int[] addition(int[] numbers){
        int[] current = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            current[i] = numbers[i];
        }
        if(numbers[0] + numbers[1] == numbers[2]){
            return numbers;
        } else if(numbers[0] + numbers[2] == numbers[1]){
            current[2] = numbers[1];
            current[1] = numbers[2];
        } else if(numbers[1] + numbers[2] == numbers[0]){
            current[0] = numbers[1];
            current[1] = numbers[2];
            current[2] = numbers[0];
        } else {
            return null;
        }
        return current;
    }

    public static int[] multiplication(int[] numbers){
        int[] current = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            current[i] = numbers[i];
        }
        if(numbers[0] * numbers[1] == numbers[2]){
            return numbers;
        } else if(numbers[0] * numbers[2] == numbers[1]){
            current[2] = numbers[1];
            current[1] = numbers[2];
        } else if(numbers[1] * numbers[2] == numbers[0]){
            current[0] = numbers[1];
            current[1] = numbers[2];
            current[2] = numbers[0];
        } else {
            return null;
        }
        return current;
    }
}
