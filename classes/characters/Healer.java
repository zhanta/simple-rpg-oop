package classes.characters;

import classes.CharacterClass;
import classes.AttackType;

public class Healer extends CharacterClass {

    public Healer(String name) {
        this.setLevel(1);
        this.setMaxHealthPoint(300);
        this.setMaxManaPoint(280);
        this.setHealthPoint(100);
        this.setManaPoint(90);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL);
        this.setAttackAmount(5);
    }
    
}
