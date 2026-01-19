public class Punto {
    private int x;
    private int y;
    public Punto() {};
    public Punto(int x, int y) {
        setX(x);
        setY(y);
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void mostrar() {
        System.out.println("Punto: " + getX() + ", " + getY());
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }
    public void desplaza(int dx, int dy){
        setX(x + dx);
        setY(y + dy);
    }
public int distancia(Punto p1){
    return (int) Math.hypot(this.x - p1.getX(), this.y - p1.getY());


}


}
