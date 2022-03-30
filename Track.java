package barriersAndParticipants;

public class Track implements Barriers{
    private final String name;
    private final int length;

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    public Track(String name, int length) {
        this.name = name;
        this.length = length;
    }
}
