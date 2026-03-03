package P6_1_2;

import java.util.ArrayList;

public class ProgramaFiguras {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<Figura>();
        figuras.add(new Figura());
        figuras.add(new Circulo(2));
        figuras.add(new Triangulo(10, 4));
        figuras.add(new Cuadrado(4));
        for (Figura figura : figuras) {
            System.out.println("Area: " + figura.area());
        }
    }
}
