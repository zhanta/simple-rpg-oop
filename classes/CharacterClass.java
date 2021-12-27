package classes;

public abstract class CharacterClass implements BaseClass {
    
    private int healthPoint;
    private int manaPoint;
    private int level;
    private int attackAmount;
    private String name;
    private int maxHealthPoint;
    private int maxManaPoint;



    @Override
    public void attack() {

    }
    @Override
    public void levelUp() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void info() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void loseHealth() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void restoreHealth() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void loseMana() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void restoreMana() {
        // TODO Auto-generated method stub
        
    }


    //Getter and Setters
    public int getAttackAmount() {
        return attackAmount;
    }
    public void setAttackAmount(int attackAmount) {
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
}
