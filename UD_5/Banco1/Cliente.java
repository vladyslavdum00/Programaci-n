package Banco1;

public class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private String localidad;
    static Cuenta[] cuentas = new Cuenta[5];


    public Cliente(String nombre, String apellido, String direccion, String localidad) {

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getLocalidad() {
        return localidad;
    }

    public String toString() {
        return nombre + " " + apellido + " " + direccion + " " + localidad;
    }

}
