public class Monster {
    private int xLocation;
    private int yLocation;

    public Monster(int xLocation, int yLocation) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
    }

    public int getxLocation() {
        return xLocation;
    }

    public int getyLocation() {
        return yLocation;
    }

    public void move(String direction){
        switch (direction){
            case "north":
                yLocation -= (int)(Math.random() * 5);
                if(yLocation < 0){
                    yLocation = 9;
                }
                break;
            case "east":
                xLocation += (int)(Math.random() * 5);
                if(xLocation > 9){
                    xLocation = 0;
                }
                break;
            case "west":
                xLocation -= (int)(Math.random() * 5);
                if(xLocation < 0){
                    xLocation = 9;
                }
                break;
            case "south":
                yLocation += (int)(Math.random() * 5);
                if(yLocation > 9){
                    yLocation = 0;
                }
                break;
        }
    }
}
