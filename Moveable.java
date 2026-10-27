public interface Moveable {
    int MAX_JARAK_GERAK = 3;
    int MIN_JARAK_GERAK = 1;
    double KECEPATAN = 1.0;
    int KOLOM_PAPAN = 8;

    void moveTo(int x, int y);
    String getPosisi();
}