package Exceptions;

public class Gato {
    private int edad;
    private String nombre;
    public Gato(int edad, String nombre)throws Exception{
       setEdad(edad);
       setNombre(nombre);
    }

    public void setEdad(int edad) throws Exception{
        if (edad > 0){
            this.edad = edad;
        }else{
            throw new Exception("La edad no puede ser negativo");
        }
    }

    public void setNombre(String nombre) throws Exception{
        if (!nombre.isEmpty()){
            if(nombre.length() > 3){
                this.nombre = nombre;
            }else{
                throw new Exception("El nombre no puede ser menor de 3 caracteres");
            }
        }else{
            throw new Exception("El nombre no puede ser vacio");
        }
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void imprimir(){
        System.out.println("El nombre: " + getNombre() + "; "+ "La edad:  " + getEdad());
    }
}
