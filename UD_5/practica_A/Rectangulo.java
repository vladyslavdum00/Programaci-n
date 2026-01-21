import java.util.Random;

public class Rectangulo {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    static final int min = 0;
    static final int max = 100;
    public Rectangulo(){};
    public Rectangulo(int x1, int y1, int x2, int y2) {
        setter_all(x1, y1, x2, y2);
    }

    public int getX1() {
        return x1;
    }
    public void setX1(int x1) {
        if (x1 < min || x1 > max || x1 > this.x2) {
            System.out.println("El numero no puede ser negativo");
        }else {
            this.x1 = x1;
        }

    }
    public int getY1() {
        return y1;
    }
    public void setY1(int y1) {

        if (y1 < min || y1 > max  || y1 > this.y2) {
            System.out.println("El numero no puede ser negativo");
        }else {
            this.y1 = y1;
        }

    }
    public int getX2() {
        return x2;
    }
    public void setX2(int x2) {
        if (x2 < min || x2 > max  || x2 < this.x1) {
            System.out.println("El numero no puede ser negativo");
        }else {
            this.x2 = x2;
        }
    }
    public int getY2() {
        return y2;
    }
    public void setY2(int y2) {
        if (y2 < min || y2 > max  || y2 < this.y1) {
            System.out.println("El numero no puede ser negativo");
        }else {
            this.y2 = y2;
        }


    }

    public void mostrar(){
        System.out.println("x1: " + getX1());
        System.out.println("y1: " + getY1());
        System.out.println("x2: " + getX2());
        System.out.println("y2: " + getY2());
    }

    public int calcularArea(){
        int restaX1 = Math.abs(getX1() - getX2());
        int restaY1 = Math.abs(getY1() - getY2());
        int area = restaX1 * restaY1;
        return area;
    }
    public int calcularPerimetro(){
        int restaX2 = Math.abs(getX2() - getX1());
        int restaY2 = Math.abs(getY2() - getY1());
        int perimetro = (restaX2 * 2) +  (restaY2 * 2);
        return perimetro;
    }

    public void setter_doble1(int x1, int y1){
        setX1(x1);
        setY1(y1);
    }
    public void setter_doble2(int x2, int y2){
       setX2(x2);
       setY2(y2);
    }

    public void setter_all(int x1, int y1, int x2, int y2){
      setter_doble1(x1, y1);
      setter_doble2(x2, y2);
    }
    public void setter_allAleatorio(){
        int x1 = new Random().nextInt(min, max);
        int y1 = new Random().nextInt(min, max);
        int x2 = new Random().nextInt(min, max);
        int y2 = new Random().nextInt(min, max);
        setter_all(x1, y1, x2, y2);
    }
}
