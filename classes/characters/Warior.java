package classes.characters;
import classes.AttackType;
import classes.CharacterClass;

public class Warior extends CharacterClass {

    public Warior(String name) {
        this.setLevel(1);
        this.setMaxHealthPoint(500);
        this.setMaxManaPoint(120);
        this.setHealthPoint(200);
        this.setManaPoint(50);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL);
        this.setAttackAmount(25);
    }
    
}
