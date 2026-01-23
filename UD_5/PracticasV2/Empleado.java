package PracticasV2;

public class Empleado {
    private String nombreCompleto;
    private int permanencia;
    private double salario;
    public Empleado() {}
    public Empleado(String nombre, int permanencia, double salario) {
        setNombreCompleto(nombre);
        setPermanencia(permanencia);
        setSalario(salario);
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public void setPermanencia(int permanencia) {
        this.permanencia = permanencia;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public int getPermanencia() {
        return permanencia;
    }
    public double getSalario() {
        return salario;
    }

    public void mostrarClasificacion() {
        if (getPermanencia() <= 3) {
            System.out.println("Clasificacion: Junior");
        } else if (getPermanencia() > 3 && getPermanencia() < 18) {
            System.out.println("Clasificacion: Middle");
        } else {
            System.out.println("Clasificacion: Senior");
        }

    }

    public void mostrar() {
        System.out.println("Nombre: " + getNombreCompleto() +"\n");
        System.out.println("Permanencia: " + getPermanencia() + "\n");
        System.out.println("Salario: " + getSalario() + "\n");
        mostrarClasificacion();
    }

    public void modificaSalario(int porcentaje) {
        this.salario = (getSalario() * porcentaje / 100) + getSalario();
    }
}
