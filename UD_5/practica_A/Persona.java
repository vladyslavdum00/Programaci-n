public class Persona {
    public String dni;
    public String nombre;
    public String apellido;
    public int edad;

    public Persona() {};
    public Persona(String dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void muestraDatos(){
        System.out.println("DNI: " + this.dni);
        System.out.println("Nombre: " + this.nombre);
    }

    public void es_mayor_edad(){
        if(this.edad >= 18){
            System.out.println("Es mayor de edad:");

        }else{
            System.out.println("No es mayor de edad:");

        }
    }

}
