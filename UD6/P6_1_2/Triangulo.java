package P6_1_2;

public class Triangulo extends Figura {
    private double base;
    private double altura;
    public Triangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    @Override
    public double area() {
        return (getBase() * getAltura()) / 2.0;
    }
}
