package P6_2_2;

import P6_1_3.Animal;

public class Gato extends Mascota{
    private String color;
    public Gato(String nombre, int edad, String color){
        super(nombre, edad);
        setColor(color);
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void habla() {
        System.out.println(getClass().getSimpleName() + " Miau Miau");
    }
    public String toString(){
        return "Nombre: " + this.nombre + ", Edad: " + this.edad + ", Color: " + getColor();
    }
}
