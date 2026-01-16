public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {};
    public Persona(String dni, String nombre, String apellido, int edad) {
        setDni(dni);
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
    }

    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void muestraDatos(){
        System.out.println(getDni() + " " + getNombre() + " " + getApellido() + " " + getEdad());
    }

    public boolean es_mayor_edad(){
        if(getEdad() >= 18){
            System.out.println("Es mayor de edad:");
            return  true;

        }else{
            System.out.println("Es mayor de edad:");
            return false;

        }
    }

}
