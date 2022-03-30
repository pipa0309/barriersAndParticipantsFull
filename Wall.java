package barriersAndParticipants;

public class Wall implements Barriers {
    private final String name;
    private final int height;

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }
}
