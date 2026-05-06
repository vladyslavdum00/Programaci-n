import java.util.HashMap;

public static class GestorStock {
    public static HashMap<String, Producto> stock = new HashMap<>();

    /**
     * @param producto
     */
    public void anadirProducto(Producto producto) {
        stock.put(producto.getNombre(), producto);
    }

    /**
     * @param producto
     */
    public void eliminarProducto(Producto producto) {
        stock.remove(producto.getNombre());
    }

    /**
     * @param producto
     * @param cantidad
     */
    public void aumentarStock(Producto producto, int cantidad) {
       producto.setCantidad(producto.getCantidad() + cantidad);
        stock.put(producto.getNombre(), producto);
    }

    /**
     *
     * @param producto
     * @param cantidad
     */
    public void disminuirStock(Producto producto, int cantidad) {
        if ((producto.getCantidad() - cantidad) < 0) {
            producto.setCantidad(producto.getCantidad());
        }else  {
            producto.setCantidad(producto.getCantidad() - cantidad);
            stock.put(producto.getNombre(), producto);
        }
    }


    /**
     * @param nombre
     */
    public void buscarProducto(String nombre){
        if (stock.containsKey(nombre)) {
            Producto producto = stock.get(nombre);
            System.out.println(producto);
        }
    }


    static class Producto{
        private String nombre;
        private double precio;
        private int cantidad;
        public Producto(String nombre, double precio, int cantidad){
            setNombre(nombre);
            setPrecio(precio);
            setCantidad(cantidad);
        }

        /**
         * @return
         */
        public String getNombre(){
            return nombre;
        }

        /**
         * @return
         */
        public double getPrecio(){
            return precio;
        }

        /**
         * @return
         */
        public int getCantidad(){
            return cantidad;
        }

        /**
         * @param nombre
         */
        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        /**
         * @param precio
         */
        public void setPrecio(double precio){
            this.precio = precio;
        }

        /**
         * @param cantidad
         */
        public void setCantidad(int cantidad){
            this.cantidad = cantidad;
        }

        /** 
         * @return
         */
        @Override
        public String toString(){
            return "Nombre: " +nombre + " Precio: " + precio + " Cantidad: " + cantidad;
        }


    }

}
public static void main(String[] args) {

    GestorStock gs = new GestorStock();
    GestorStock.Producto p1 = new GestorStock.Producto("movil", 500, 5);
    GestorStock.Producto p2 = new GestorStock.Producto("portatil", 1000, 2);
    GestorStock.Producto p3 = new GestorStock.Producto("tablet", 700, 8);
    gs.anadirProducto(p1);
    gs.anadirProducto(p2);
    gs.anadirProducto(p3);

    gs.aumentarStock(p2, 10);
    gs.disminuirStock(p1, 3);
    gs.disminuirStock(p1, 3);
    gs.eliminarProducto(p3);
    gs.disminuirStock(p2, 6);

    GestorStock.stock.forEach((clave, valor) -> {
        System.out.println(clave + " -> " + valor);
    });

    gs.buscarProducto("movil");

}
