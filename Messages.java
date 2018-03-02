public class Messages {

    private String goal = "You find a partially buried chest. It is filled with treasure!";
    private String start = "You find yourself in a barren moor. Try 'look'";
    private String look = "The heavy grey sky hangs oppressively over your head, reflecting dismally" +
            " from the dark, murky water sapping the warmth from your shins.\nHere and there " +
            "dismal plants struggle to survive, barely above the water.\nThere is a strange device " +
            "upon your arm. It seems to be displaying a distance.\n";
    private String tree = "You stumble across a stunted tree sticking out from the water.\n" +
            "As you look at the tree you begin to notice disturbing patterns in its bark, almost as if\n" +
            " it were a person twisting in agony. You quickly look away and resolve to keep moving\n";
    private String monster = "A sudden sound behind you causes you to whirl around.\n" +
            "There behind you is a looming shape, with unnaturately long arms, its features obscured by mud,\n" +
            "detritus and the ever-present gloom. With a gurgling screech it lunges forward and drags you into the\n" +
            "muck below...";
    private String instructions = "The game involves searching a moor for a treasure chest while avoiding the monster.\n" +
            "The player can type 'north' to move one place north, 'west' to move one place west, 'south' to\n" +
            "move one place south and 'east' to move one place east. If the player moves onto a space with\n" +
            "the monster they lose. If the player moves onto the space with the treasure they win.";
    private String trap = "As you wade through the moor you feel something brush against your shins. Dismissing it as\n" +
            "a submerged plant you continue forwards. Suddenly something closes around your ankles and before you have\n" +
            "time to react you are dragged into the murky waters...";

    public String getMessage(String message) {
        switch (message){
            case "goal":
                return goal;
            case "start":
                return start;
            case "look":
                return look;
            case "tree":
                return tree;
            case "monster":
                return monster;
            case "instructions":
                return instructions;
            case "trap":
                return trap;
            default:
                return "This is not a valid command.";
        }
    }
}
