package HashMap;

import java.util.HashMap;

public class GestorStock {
    HashMap<String, Producto> stock = new HashMap<>();
    public void anadirProducto(Producto producto) {
        stock.put(producto.getNombre(), producto);
    }
    public void eliminarProducto(Producto producto) {
        stock.remove(producto.getNombre());
    }
    public void aumentarStock(Producto producto, int cantidad) {
       producto.setCantidad(cantidad);
        stock.put(producto.getNombre(), producto);
    }
    public
    class Producto{
        private String nombre;
        private double precio;
        private int cantidad;
        public Producto(String nombre, double precio, int cantidad){
            setNombre(nombre);
            setPrecio(precio);
            setCantidad(cantidad);
        }
        public String getNombre(){
            return nombre;
        }
        public double getPrecio(){
            return precio;
        }
        public int getCantidad(){
            return cantidad;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setPrecio(double precio){
            this.precio = precio;
        }
        public void setCantidad(int cantidad){
            this.cantidad = cantidad;
        }


        public static void main(String[] args) {
            GestorStock gs = new GestorStock();
        }

    }

}
