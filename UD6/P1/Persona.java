package P1;

import java.util.ArrayList;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String fechaNacimiento;
    public Persona(String nombre, String apellido, String fechaNacimiento) {
        setNombre(nombre);
        setApellido(apellido);
        setFechaNacimiento(fechaNacimiento);


    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", Fecha de nacimiento: " + getFechaNacimiento();
    }

}
