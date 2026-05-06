package SistemaDeSeguridad;

public class LucesEmergencia extends Dispositivo implements IActivable {
    public LucesEmergencia(int id, String modelo){
        super(id, modelo);
    }
    @Override
    public void encender(){
        System.out.println("Luces de Emergencia activadas");
    }
    @Override
    public void apagar(){
        System.out.println("LucesEmergencia apagando...");
    }

}
