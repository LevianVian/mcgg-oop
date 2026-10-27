public interface Star {
    int MIN_STAR = 1;
    int MAX_STAR = 3;
    int HERO_UPGRADE = 3;
    double BONUS_STAT = 1.8;

    void upgradeStar();
    int getStarLevel();
}