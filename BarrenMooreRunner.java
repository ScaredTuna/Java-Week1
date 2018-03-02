import java.util.Scanner;

public class BarrenMooreRunner {

    public static void main(String[] args){


        Moor game = new Moor();
        Scanner s = new Scanner(System.in);
        game.menu(s);
    }
}
