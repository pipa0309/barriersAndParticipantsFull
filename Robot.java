package barriersAndParticipants;

public class Robot implements Participants {
    private final String name;
    private final int limitRun;
    private final int limitJump;

    public Robot(String name, int limitRun, int limitJump) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    @Override
    public boolean run(Barriers barriers) {
        if (barriers instanceof Track) {
            if (((Track) barriers).getLength() <= this.limitRun) {
                System.out.printf("%s run across %s\n", this.name, ((Track) barriers).getName());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean jump(Barriers barriers) {
        if (barriers instanceof Wall) {
            if (((Wall) barriers).getHeight() <= this.limitJump) {
                System.out.printf("%s jump across %s\n", this.name, ((Wall) barriers).getName());
                return true;
            }
        }
        return false;
    }
}

