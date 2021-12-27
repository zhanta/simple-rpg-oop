package classes.characters;
import classes.AttackType;
import classes.CharacterClass;

public class Archer extends CharacterClass {
    public Archer(String name) {
    this.setLevel(1);
    this.setMaxHealthPoint(380);
    this.setMaxManaPoint(150);
    this.setHealthPoint(140);
    this.setManaPoint(70);
    this.setName(name);
    this.setAttackType(AttackType.PHYSICAL_RANGED);
    this.setAttackAmount(15);
    }
}
