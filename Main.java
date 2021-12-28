import Party.Party;
import classes.characters.Archer;
import classes.characters.Mage;
import classes.characters.Warior;
import classes.characters.Healer;

public class Main {
    public static void main(String[] args) {
        Party party = new Party(new Mage("Gendalf"), new Warior("Aragorn"), new Archer("Legolas"), new Healer("Frodo"));
        party.info();
    }
}