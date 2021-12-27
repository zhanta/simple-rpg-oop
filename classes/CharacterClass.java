package classes;


public abstract class CharacterClass implements BaseClass {
    
    private int healthPoint;
    private int manaPoint;
    private int level;
    private int attackAmount;
    private String name;
    private int maxHealthPoint;
    private int maxManaPoint;
    private AttackType attackType;


    @Override
    public void attack() {

    }
    @Override
    public void levelUp() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void info() {
        System.out.println("Name: " + this.name + ", HP: " + this.healthPoint + ", Mana: " + this.manaPoint + ", level: " + this.level);
    }
    @Override
    public void loseHealth(int amount) {
        setHealthPoint(this.healthPoint - amount);        
    }
    @Override
    public void restoreHealth(int amount) {
        setHealthPoint(this.healthPoint + amount);
    }

    @Override
    public void loseMana(int amount) {
        setManaPoint(this.manaPoint - amount);
    }
    @Override
    public void restoreMana(int amount) {
        setManaPoint(this.manaPoint + amount);                
    }


    //Getter and Setters
    public int getAttackAmount() {
        return attackAmount;
    }
    public void setAttackAmount(int attackAmount) {
        if(attackAmount < 0) System.out.println("We can't damage by this 0!");
        this.attackAmount = attackAmount;
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public void setHealthPoint(int healthPoint) {
        if(healthPoint < 0 ) this.healthPoint = 0;
        else if( healthPoint > this.maxHealthPoint) this.healthPoint = this.maxHealthPoint;
        else this.healthPoint = healthPoint;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        if(level < 0) this.level = 1;
        this.level = level;
    }
    public int getManaPoint() {
        return manaPoint;
    }
    public void setManaPoint(int manaPoint) {
        if(manaPoint < 0) this.manaPoint = 0;
        else if(manaPoint > maxManaPoint) this.manaPoint = this.maxManaPoint;
        else this.manaPoint = manaPoint;
    }
    public int getMaxHealthPoint() {
        return maxHealthPoint;
    }
    public void setMaxHealthPoint(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
    }
    public int getMaxManaPoint() {
        return maxManaPoint;
    }
    public void setMaxManaPoint(int maxManaPoint) {
        this.maxManaPoint = maxManaPoint;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public AttackType getAttackType() {
        return attackType;
    }
    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }

}
