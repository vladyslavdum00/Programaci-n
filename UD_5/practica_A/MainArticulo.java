package practica_A;

public class MainArticulo {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("camiseta", 10.0, 95, "Maquinaria");
       articulo1.mostrar();
       articulo1.precioPVP();
       articulo1.getPVPDescuento(15);


//        System.out.println(articulo1.vender(0));
//        articulo1.mostrar();
//
//        System.out.println(articulo1.almacenar(5));
//        articulo1.mostrar();
    }
}
