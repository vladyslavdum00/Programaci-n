package PracticasV2;

public class MainEmpleado {
    public static void main(String[] args) {
    Empleado empleado = new Empleado("Pablo Lopez", 2, 1000.0);
    empleado.mostrar();
    empleado.modificaSalario(50);
    empleado.mostrar();

    }
}
