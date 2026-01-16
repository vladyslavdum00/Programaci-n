public class MainPunto {
    public static void main(String[] args) {
        Punto punto1 = new Punto(6, 10);
       Punto punto2 = new Punto(3, 6);
//        Punto punto3 = new Punto(-3, 7);

        punto1.mostrar();
//        punto2.mostrar();
//        punto3.mostrar();

        punto1.setX(punto1.getX() +100);
        punto1.mostrar();

        System.out.println();
    }
}
