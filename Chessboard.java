class Chessboard extends Hero implements Star {
    private String boardPosition;
    private int boardSize;
    private int starLevel = 1;

    public Chessboard(String heroName, int hp, int damage, int range, String boardPosition, int boardSize) {
        super(heroName, hp, damage, range);
        this.boardPosition = boardPosition;
        this.boardSize = boardSize;
    }

    @Override
    public void attack() {
        System.out.println(getHeroName() + " menyerang dari papan catur posisi " + boardPosition);
    }

    @Override
    public void upgradeStar() {
        if (starLevel < MAX_STAR) {
            starLevel++;
            System.out.println(getHeroName() + " berhasil upgrade bintang ke level: " + starLevel);
        } else {
            System.out.println("Bintang sudah mencapai maksimal!");
        }
    }

    @Override
    public int getStarLevel() {
        return starLevel;
    }

    public String getBoardLevel() {
        return "Standard Chess Board Level 1";
    }
}