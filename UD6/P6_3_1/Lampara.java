package P6_3_1;

public class Lampara implements IEncendible{
    int watios;
    public Lampara(int watios) {
        this.watios = watios;
    }
    public void encender(){
        System.out.println("La luz de la lámpara se enciende");
    }
    public void apagar(){
        System.out.println("La luz de la lámpara se apaga");
    }
}
