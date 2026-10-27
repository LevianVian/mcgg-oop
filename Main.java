public class Main {
    public static void main(String[] args) {
        System.out.println("== Magic Chess Go Go - OOP ==\n");

        Chessboard board = new Chessboard("A1", 8);
        System.out.println("Board Position: " + board.getBoardPosition());
        System.out.println("Board Level: " + board.getBoardLevel() + "\n");

        board.attack();
        board.upgradeStar();

        System.out.println("\n-----------------------------------------------\n");

        Synergy Dragoncaller = new Synergy("Clint", 1200, 250, 50, 3, "Weapon Master", 3);

        System.out.println("Hero Name: " + Dragoncaller.getHeroName());
        System.out.println("HP: " + Dragoncaller.getHp());
        System.out.println("Synergy Active: " + Dragoncaller.getSynergyName() + " (" + Dragoncaller .getActiveSynergyCount() + " heroes)\n");
        
        Dragoncaller.attack();
        Dragoncaller.useSkill();
        Dragoncaller.takeDamage(300);

        Dragoncaller.moveTo(4, 5);
        System.out.println("\nCurrent Position: " + Dragoncaller.getPosisi());

        Dragoncaller.upgradeStar();
        System.out.println("\nStar Level: " + Dragoncaller.getStarLevel());
    }
}