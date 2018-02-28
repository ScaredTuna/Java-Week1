import java.util.ArrayList;

public class DoggoComp2 {

    public static void main(String[] args){
        ArrayList<Integer> ranks = placements(1);
        System.out.println(placeName(ranks));
    }

    public static ArrayList<Integer> placements(int place){
        ArrayList<Integer> ranks = new ArrayList<>();
        for (int i = 1; i < 101; i++){
            if (i != place) {
                ranks.add(i);
            }
        }
        return ranks;
    }

    public static String placeName(ArrayList<Integer> ranks) {
        String complete = "";
        for (Integer i : ranks) {
            int place = i;
            String current;
            int j = place;
            if (place > 13) {
                j = (place % 10);
            }
            switch (j) {
                case 1:
                    current = (place + "st, ");
                    break;
                case 2:
                    current = place + "nd, ";
                    break;
                case 3:
                    current = place + "rd, ";
                    break;
                default:
                    current = place + "th, ";
                }
                complete += current;

        }

            return complete;
        }
    }

