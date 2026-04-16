package P6_3_1;

public class Horno implements IEncendible{
    int potencia;
    public Horno(int potencia){
        this.potencia = potencia;
    }
    public void apagar(){
        System.out.println("El horno deja de calentar");
    }
    public void encender(){
        System.out.println("El horno calienta");
    }
}
