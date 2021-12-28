package party;
import classes.CharacterClass;
import dungeon.Dungeon;

public class Party {
    private CharacterClass[] partyMembers;
    private Dungeon dungeon;
    public Party(CharacterClass... members) {
        partyMembers = new CharacterClass[members.length];
        //this.partyMembers = partyMembers;
        for(int i = 0; i< partyMembers.length;i++) {
            partyMembers[i] = members[i];
        }
    }

    public void runDungeon() {
	    // not ended
    }
    public CharacterClass[] getPartyMembers() {
        return partyMembers;
    }
    public void setPartyMembers(CharacterClass[] partyMembers) {
        this.partyMembers = partyMembers;
    }
    public void info() {
        for(CharacterClass partyMember: partyMembers) {
            partyMember.info();
        }
    }

    public boolean enterDungeon(Dungeon dungeon) {
        return dungeon.open(this);
    }



    public void setDungeon(Dungeon dungeon) {
        this.dungeon = dungeon;
    }

    public Dungeon getDungeon() {
        return dungeon;
    }

}
