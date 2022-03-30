//for checking
/*
У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше он по списку
препятствий не идет */

package barriersAndParticipants;

public class WorkClass {
    public static void main(String[] args) {
        Participants[] participants = createArrayParticipants();
        Barriers[] barriers = createArrayBarriers();
        interconnectionParticipantsAndBarriers(participants, barriers);
    }

    private static Participants[] createArrayParticipants() {
        return new Participants[]{
                new Human("'Human1'", 55, 15),
                new Cat("'Cat1'", 65, 21),
                new Robot("'Robot1'", 70, 7)

        };
    }

    private static Barriers[] createArrayBarriers() {

        return new Barriers[]{
                new Track("'Track2'", 55),
                new Wall("'Wall1'", 16),
                new Track("'Track1'", 56),
                new Wall("'Wall2'", 22)

        };
    }

    private static void interconnectionParticipantsAndBarriers(Participants[] participants, Barriers[] barriers) {

        for (Participants participant : participants) {
            for (Barriers barrier : barriers) {
                boolean flag1 = participant.run(barrier);
                boolean flag2 = participant.jump(barrier);
                if ((!flag1) && (!flag2)) {
                    break;
                }
            }
        }
    }
}


