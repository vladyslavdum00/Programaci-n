public class MainRectangulo {
    public static void main(String[] args) {
    Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
    Rectangulo r2 = new Rectangulo(7, 9, 2, 3);

    r1.mostrar();
    r2.mostrar();
        System.out.println("Area: " + r1.calcularArea());
        System.out.println("Perimetro: " + r1.calcularPerimetro());
        System.out.println();
        System.out.println("Perimetro: " + r2.calcularPerimetro());
        System.out.println("Area: " + r2.calcularArea());

    }
}
