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
}
