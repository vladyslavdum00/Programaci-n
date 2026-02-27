package P1;

public class Profesor extends Persona{
    private double sueldo;
    private String especialidad;
    public Profesor(String nombre, String apellido, String fechaNacimiento, double sueldo, String especialidad) {
        super(nombre, apellido, fechaNacimiento);
        setSueldo(sueldo);
        setEspecialidad(especialidad);
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String getNombre() {
        return "Profesor: " + super.getNombre();
    }
    @Override
    public String toString() {
        return super.toString() + ", Especialidad: " + getEspecialidad() + ", Sueldo: " + getSueldo();
    }
}
