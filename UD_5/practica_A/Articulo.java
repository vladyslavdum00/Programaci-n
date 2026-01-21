
public class Articulo {
    private String nombre;
    private double precio;
    private int cantidadRestantes;
    private String categoria;
    final double ivaG = 0.21;
    final double ivaR = 0.10;
    final double ivaSR = 0.04;

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

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getIva() {
        return ivaG;
    }

    public void mostrar(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Cantidad Restantes: " + getCantidadRestantes());
    }
    public void precioPVP(){
        if (this.categoria.equals("PVP")){

        }
        System.out.println("Precio PVP: " + (precio + (precio * ivaG)));

    }

    public void getPVPDescuento(int descuento){
        double desc = (precio + (precio * ivaG)) * descuento / 100;
        double PrecioDescuento = (precio + (precio * ivaG)) - desc;
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


    public boolean almacenar(int cantidad){
        if ((this.cantidadRestantes + cantidad) <= 100){
            this.cantidadRestantes += cantidad;
            System.out.println("Se ha almacenado");
            return true;
        }else{
            System.out.println("No hay suficiente espacio");
            return false;
        }
    }
}
