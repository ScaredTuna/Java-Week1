
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Moor {

    private boolean gameContinue = true;
    private boolean gameWon = false;
    private Messages eventMessage = new Messages();
    private Player player = new Player((int)(Math.random()*10), (int)(Math.random()*10));
    private Monster monster = new Monster((int)(Math.random()*10), (int)(Math.random()*10));
    private Event scaryTree = new Event((int)(Math.random()*10), (int)(Math.random()*10), eventMessage.getMessage("tree"));
    private Event trap = new Event((int)(Math.random()*10), (int)(Math.random()*10), eventMessage.getMessage("trap"));
    private Event goal = new Event((int)(Math.random()*10), (int)(Math.random()*10), eventMessage.getMessage("goal"));

    public String playerMove(String direction){
        player.move(direction);
        monster.move(direction);
        if(player.getyLocation() == goal.getyLocation() && player.getxLocation() == goal.getxLocation()){
            gameContinue = false;
            gameWon = true;
            return goal.getDescription();
        }else if (player.getxLocation() == monster.getxLocation() && player.getyLocation() == monster.getyLocation()) {
            gameContinue = false;
            return getResult("monster");
        }else {
        return checkEvent() + "\n\n" + getDistance();
        }
    }

    public String getDistance(){
        int xDistance = Math.abs(goal.getxLocation() - player.getxLocation());
        int yDistance = Math.abs(goal.getyLocation() - player.getyLocation());
        double distance = Math.sqrt(Math.pow((double)xDistance, 2) + Math.pow((double)yDistance, 2));
        return "The device reads '" + new BigDecimal(distance * 10).setScale(2, RoundingMode.HALF_UP).doubleValue() + "m'\n";
    }

    public String getResult(String message){
        if (message.equals("north") || message.equals("west") || message.equals("east") || message.equals("south")){
            return playerMove(message);
        } else {
            return eventMessage.getMessage(message);
        }
    }

    public void menu(Scanner s){
        String move = "start";
        while (move.equals("start")) {
            System.out.println("Welcome to The Adventure of the Barren Moor\n" +
                "-------------------------------------------\n" +
                "1. Play\n2. Instructions\n3. Exit\n" +
                "-------------------------------------------");
            move = s.nextLine();
            if(move.equalsIgnoreCase("play") || move.equals("1")) {
                System.out.println(getResult("start"));
                move = s.nextLine();
                System.out.println(getResult(move));
                System.out.println(getDistance());
                while (gameContinue) {
                    System.out.println("Try 'north', 'south', 'east' or 'west'.");
                    move = s.nextLine();
                    System.out.println("---------------------------------");
                    System.out.println(getResult(move));
                }
                if (gameWon) {
                    System.out.println("Congratulations! You win!");
                } else {
                    System.out.println("Game Over! The Monster caught you!");
                }
                while (!move.equalsIgnoreCase("n") && !move.equalsIgnoreCase("start")) {
                    System.out.println("---------------------------------");
                    System.out.println("Do you want to play again y/n?");
                    move = s.nextLine();
                    if (move.equalsIgnoreCase("y")) {
                        move = "start";
                    } else if (!move.equalsIgnoreCase("n")){
                        System.out.println("Invalid choice. Please enter either y or n.");
                    }
                }
            } else if (move.equalsIgnoreCase("instructions") || move.equals("2")){
                System.out.println(getResult("instructions"));
                move = "start";
            } else if(move.equalsIgnoreCase("exit") || move.equals("3")) {
                move ="";
            } else {
                System.out.println("Invalid selection");
                move = "start";
            }
        }
    }

    public String checkEvent(){
        if(player.getxLocation() == trap.getxLocation() && player.getyLocation() == trap.getyLocation()){
            return trap.getDescription();
        } else if(player.getxLocation() == scaryTree.getxLocation() && player.getyLocation() == scaryTree.getyLocation()) {
            return scaryTree.getDescription();
        } else {
            return "The moor seems to stretch on endlessly";
        }
    }
}
