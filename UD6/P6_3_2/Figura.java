package P6_3_2;

public abstract class Figura {
    protected int x;
    protected int y;
    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Figura en posición (" + x + ", " + y + ")";
    }
}
