public class Persona {
    final String dni;
    private String nombre;
    private String apellido;
    private int edad;
    static final int mayoriaEdad = 18;
    static final int jubiladoEdad = 65;

    public Persona(String dni, String nombre, String apellido, int edad) {
        if (validarDNI(dni)){
            this.dni = dni;
        }else{
            this.dni = null;
        }
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


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void muestraDatos() {
        System.out.println(getDni() + " " + getNombre() + " " + getApellido() + " " + getEdad());
    }

    public boolean es_mayor_edad() {
        if (getEdad() >= mayoriaEdad) {
            System.out.println("Es mayor de edad:");
            return true;

        } else {
            System.out.println("Es mayor de edad:");
            return false;

        }

    }

    public boolean es_jubilado(){
        if(getEdad() >= jubiladoEdad){
            System.out.println("Es jubilado:");
            return  true;
        }else{
            System.out.println("Es jubilado:");
            return false;
        }

    }

    public int diferencia_edad(Persona p) {
        System.out.println("Diferencia edad:");
        return Math.abs(this.edad - p.getEdad());
    }

    static boolean validarDNI(String dni){
        if (dni.length() != 9){
            return false;
        }
        boolean letra = false;
        int contador = 0;
        if(dni.charAt(8) >= 'A' && dni.charAt(8) <= 'Z'){
            letra = true;
        }
        for(int i = dni.length() - 1; i >= 0; i--){
            if (dni.charAt(i) < 'A' || dni.charAt(i) > 'Z') {
                contador++;
            }

            if(letra && contador == 8){
                return true;
            }
        }
        return false;
    }

}
