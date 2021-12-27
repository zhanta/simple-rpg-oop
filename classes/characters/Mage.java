package classes.characters;
import classes.CharacterClass;
import classes.AttackType;
public class Mage extends CharacterClass {

    public Mage(String name) {
        this.setLevel(1);
        this.setMaxHealthPoint(300);
        this.setMaxManaPoint(300);
        this.setHealthPoint(120);
        this.setManaPoint(120);
        this.setName(name);
        this.setAttackType(AttackType.MAGICAL_RANGED);
        this.setAttackAmount(10);
    }
    
}
