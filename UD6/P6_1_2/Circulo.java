package P6_1_2;

public class Circulo extends Figura {
    private double radio;
    public Circulo(double radio) {
        setRadio(radio);
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    @Override
    public double area() {
        return 3.14 * getRadio() * getRadio();
    }
}
