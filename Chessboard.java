class Chessboard extends Hero implements Star {
    private String boardPosition;
    private int boardSize;
    private int starLevel = 1;

    public Chessboard(String boardPosition, int boardSize) {
        super(); 
        this.boardPosition = boardPosition;
        this.boardSize = boardSize;
        setHeroName("Chessboard Hero");}

        
    public String getBoardPosition() {
        return boardPosition;
    }

    public void setBoardPosition(String boardPosition) {
        this.boardPosition = boardPosition;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    @Override
    public void attack() {
        System.out.println((getHeroName() != null ? getHeroName() : "Chessboard") + " menyerang dari papan catur posisi " + boardPosition);
    }

    @Override
    public void useSkill() {
        System.out.println("Chessboard menggunakan skill papan!");
    }

    @Override
    public void upgradeStar() {
        if (starLevel < MAX_STAR) {
            starLevel++;
            System.out.println("Berhasil upgrade bintang ke level: " + starLevel);
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