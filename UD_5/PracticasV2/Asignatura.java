package PracticasV2;

public class Asignatura {
    private String nombre;
    private int codigo;
    private String curso;

    public Asignatura(String nombre, int codigo, String curso) {
        setNombre(nombre);
        setCodigo(codigo);
        setCurso(curso);
    }

    public String getNombre() {
        return nombre;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getCurso() {
        return curso;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void mostrar() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Curso: " + getCurso());
    }

}
