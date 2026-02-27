package P1;

public class Alumno extends Persona{
    private String grupo;
    private double notaMedia;
    public Alumno(String nombre, String apellido, String fechaNacimiento, String grupo, double notaMedia) {
        super(nombre, apellido, fechaNacimiento);
       setGrupo(grupo);
       setNotaMedia(notaMedia);
    }
    public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    public double getNotaMedia() {
        return notaMedia;
    }
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String getNombre() {
        return "ALumno: " + super.getNombre();
    }

    @Override
    public String toString() {
        return super.toString() + ", Grupo: " + getGrupo() + ", Nota media: " + getNotaMedia();
    }
}
