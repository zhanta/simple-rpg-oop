package dungeon;

import party.Party;

public class Dungeon implements BasicDungeon {
    private boolean isOpened = false;
    private MonsterClass[] monsters;



    @Override
    public boolean open(Party party) {
        if(party.getPartyMembers().length < 3) {
            System.out.println("Not enough party members!");
            isOpened = false;
        }
        else {
            System.out.println("Heroes are entered to Dungeon!\n Get ready for enemies");
            isOpened = true;
        }
        return isOpened;
    }
}
