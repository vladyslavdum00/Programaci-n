package P6_3_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Punto(12, 125));
        figuras.add(new Triangulo(45, 50, 10, 4));
        figuras.add(new Rectangulo(20, 100, 12, 5));
        figuras.add(new Cubo(20, 100, 12));

        for (Figura figura : figuras) {
            System.out.println(figura.toString());
        }
        System.out.println();
        ArrayList<IFigura2D> figuras2D = new ArrayList<>();
        figuras2D.add(new Triangulo(45, 50, 10, 4));
        figuras2D.add(new Rectangulo(20, 100, 12, 5));

        for (IFigura2D figura2D : figuras2D) {
            System.out.println(figura2D.calcularArea());
        }

        ArrayList<IFigura3D> figuras3D = new ArrayList<>();
        figuras3D.add(new Cubo(20, 100, 12));
        figuras3D.add(new Cubo(20, 100, 10));
        figuras3D.add(new Cubo(20, 100, 8));
        figuras3D.add(new Cubo(20, 100, 6));
        figuras3D.add(new Cubo(20, 100, 2));

        for (IFigura3D figura3D : figuras3D) {
            System.out.println(figura3D.calcularVolumen());
        }

    }


}
