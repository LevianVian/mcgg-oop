public abstract class Hero {
    private int hp;
    private int damage;
    private int hybridAttack;
    private int attackRange;
    private String heroName;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHybridAttack() {
        return hybridAttack;
    }

    public void setHybridAttack(int hybridAttack) {
        this.hybridAttack = hybridAttack;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void  takeDamage(int recievedDamage) {
        this.hp -= recievedDamage;
        System.out.println(this.heroName + " recieved " + recievedDamage + " damage");
        System.out.println(this.heroName + " current HP bar is " + this.hp);
    }

    public abstract void attack();

    public abstract void useSkill();
}