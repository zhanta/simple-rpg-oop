package dungeon;

import Party.Party;

public class Dungeon implements BasicDungeon {
    private boolean isOpened = false;
    @Override
    public void open(Party party) {
        if(party.getPartyMembers().length < 3) {
            System.out.println("Not enough party members!");
            isOpened = false;
        }
        else {
            System.out.println("Heroes are entered to Dungeon!\n Get ready for enemies");
            isOpened = true;
        }
    }
}