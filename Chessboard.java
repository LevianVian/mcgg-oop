public class Chessboard {
    private String boardPosition;
    private int boardSize;

    public Chessboard(String boardPosition, int boardSize) {
        this.boardPosition = boardPosition;
        this.boardSize = boardSize;
    }

    public void attack() {
        System.out.println("Executing attack on board position: " + boardPosition);
    }

    public void upgradeStar(){
        System.out.println("Upgrding star level...");
    }

    public int getStarLevel() {
        return 1;
    }

    public String getBoardLevel() {
        return "Level 1";
    }

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
}