package Banco1;

public class Cliente {
    private String nombre;
    private String apellido;



    public Cliente(String nombre, String apellido) {
        setNombre(nombre);
        setApellido(apellido);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }





}
