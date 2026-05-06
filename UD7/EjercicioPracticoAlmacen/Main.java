package EjercicioPracticoAlmacen;

public class Main {
    public static void main(String[] args) {
        Componente c1 = new Componente("14 Pro", "Iphone", 1300);
        Componente c2 = new Componente("13 Pro", "Iphone", 1000);
        Componente c10 = new Componente("14 Pro", "Iphone", 1300);
        Componente c3 = new Componente("S35 Ultra", "Samsung", 1500);
        Componente c4 = new Componente("Mi 9", "Xioami", 800);
        Componente c5 = new Componente("Mi 10", "Xioami", 800);
        try {
            Almacen almacen = new Almacen();
            almacen.anadirComponente(c1, 5);
            almacen.anadirComponente(c2, 5);
            almacen.anadirComponente(c3, 1);
            almacen.anadirComponente(c4, 3);
            almacen.anadirComponente(c10, 100);
            almacen.mostrarStock();
            System.out.println("---------------------------");
            almacen.venderComponente(c1, 50);
            almacen.venderComponente(c5, 10);



        } catch (StockInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
