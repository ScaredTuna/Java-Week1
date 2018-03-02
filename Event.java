public class Event {
    private int xLocation;
    private int yLocation;
    private String description;

    public Event(int xLocation, int yLocation, String description) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.description = description;
    }

    public int getxLocation() {
        return xLocation;
    }

    public int getyLocation() {
        return yLocation;
    }

    public String getDescription() {
        return description;
    }
}
