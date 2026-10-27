public class Synergy extends Hero implements Star, Moveable {
    private int activeSynergyCount;
    private String synergyName;
    private String position = "0,0";

    public Synergy(String heroName, int hp, int damage, int hybridAttack, int attackRange, String synergyName, int activeSynergyCount) {
        setHeroName(heroName);
        setHp(hp);
        setDamage(damage);
        setHybridAttack(hybridAttack);
        setAttackRange(attackRange);
        this.synergyName = synergyName;
        this.activeSynergyCount = activeSynergyCount;
    }

    public int getActiveSynergyCount() {
        return activeSynergyCount;
    }

    public void setActiveSynergyCount(int activeSynergyCount) {
        this.activeSynergyCount = activeSynergyCount;
    }

    public String getSynergyName() {
        return synergyName;
    }

    public void setSynergyName(String synergyName) {
        this.synergyName = synergyName;
    }

    @Override
    public void attack() {
        System.out.println(getHeroName() + " (Synergy: " + synergyName + ") attacks with base damage: " + getDamage());
    }

    @Override
    public void useSkill() {
        System.out.println(getHeroName() + " activates skill bound to synergy " + synergyName + "!");
    }

    @Override
    public void upgradeStar() {
        System.out.println("Upgrading star level for " + getHeroName() + " with synergy boost " + BONUS_STAT + "x...");
    }

    @Override
    public int getStarLevel() {
        return MIN_STAR;
    }

    @Override
    public void moveTo(int x, int y) {
        this.position = x + "," + y;
        System.out.println(getHeroName() + " moved to position (" + x + ", " + y + ") with speed " + KECEPATAN);
    }

    @Override
    public String getPosisi() {
        return this.position;
    }
}