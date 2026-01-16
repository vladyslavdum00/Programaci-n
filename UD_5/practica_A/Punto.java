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
public int distancia(Punto p1, Punto p2){
        int distanciaX = Math.abs(p1.getX() - p2.getX());
        distanciaX = distanciaX * distanciaX;
        int distanciaY = Math.abs(p1.getY() - p2.getY());
        distanciaY = distanciaY * distanciaY;
        int distanciaEnCuadrado = distanciaX + distanciaX;
        double ds = Math.sqrt(distanciaEnCuadrado);
        String dst = ds + " ";
        int distancia = Integer.parseInt(dst);
        return distancia;


}


}
