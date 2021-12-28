import classes.characters.Archer;
import classes.characters.Mage;
import classes.characters.Warior;
import dungeon.Dungeon;
import party.Party;
import classes.characters.Healer;

public class Main {
    public static void main(String[] args) {
        Party party = new Party(new Mage("Gendalf"), new Warior("Aragorn"), new Archer("Legolas"), new Healer("Frodo"));
        party.info();
        Dungeon dungeon = new Dungeon();
        if(party.enterDungeon(dungeon)) {
            party.setDungeon(dungeon);
            party.runDungeon();
        }
        else {
            System.out.println("X Game Over X");
        }

    }
}