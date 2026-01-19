public class MainArticulo {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("camiseta", 15.0, 5);
       // articulo1.mostrar();
       //articulo1.precioPVP();
       //articulo1.getPVPDescuento(15);


        System.out.println(articulo1.vender(2));
        articulo1.mostrar();
    }
}
