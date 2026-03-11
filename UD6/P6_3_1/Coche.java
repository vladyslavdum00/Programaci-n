package P6_3_1;

public class Coche implements IEncendible{
    int km;
    int asientos;
    public Coche(int km, int asientos) {
        this.km = km;
        this.asientos = asientos;
    }
    public void encender(){
        System.out.println("El coche arranca");
    }
    public void apagar(){
        System.out.println("El coche se para");
    }
}
