public class Articulo {
    private String nombre;
    private double precio;
    private int cantidadRestantes;
    private double iva = 0.21;

    public Articulo() {}
    public Articulo(String nombre, double precio, int cantidadRestantes){
        if (cantidadRestantes<0 || precio<0 || nombre==null){
            System.out.println("Datos no son validos");
        }else{
            setNombre(nombre);
            setPrecio(precio);
            setCantidadRestantes(cantidadRestantes);
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidadRestantes() {
        return cantidadRestantes;
    }
    public void setCantidadRestantes(int cantidadRestantes) {
        this.cantidadRestantes = cantidadRestantes;
    }

    public double getIva() {
        return iva;
    }

    public void mostrar(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Cantidad Restantes: " + getCantidadRestantes());
    }
    public void precioPVP(){
        System.out.println("Precio PVP: " + (precio + (precio * iva)));

    }

    public void getPVPDescuento(int descuento){
        double desc = (precio + (precio * iva)) * descuento / 100;
        double PrecioDescuento = (precio + (precio * iva)) - desc;
        System.out.println("Precio con descuento: " + PrecioDescuento);
    }


    public boolean vender(int cantidad){
        if ((this.cantidadRestantes - cantidad) < 0){
            System.out.println("No hay suficiente en stock");
            return false;
        }else{
            this.cantidadRestantes -= cantidad;
            System.out.println("Vendido");
            return true;
        }
    }

}
