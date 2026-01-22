package practica_A;
public class MainPunto {
    public static void main(String[] args) {
        Punto punto1 = new Punto(0, 0);
       //Punto punto2 = new Punto(3, 4);
//        Punto punto3 = new Punto(-3, 7);

       // punto1.mostrar();
//        punto2.mostrar();
//        punto3.mostrar();

        //punto1.setX(punto1.getX() +100);
//        punto1.mostrar();
//
//        System.out.println();
//        punto1.setXY(0, 0);
//        punto1.desplaza(0, 0);
//        punto1.mostrar();
//        System.out.println(punto1.distancia(punto2));
        Punto PuntoAleatorio = Punto.creaPuntoAleatorio();
        PuntoAleatorio.mostrar();
    }
}
