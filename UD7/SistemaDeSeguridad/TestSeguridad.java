package SistemaDeSeguridad;

import java.util.ArrayList;

public class TestSeguridad {
    public static void main(String[] args) {
        ArrayList<Dispositivo> dispositivos = new ArrayList<>();
        CamaraSeguridad camara = new CamaraSeguridad(10, "Asus");
        SensorHumo sensor = new SensorHumo(20, "Smoke");
        LucesEmergencia luces = new LucesEmergencia(30, "Luces");
        dispositivos.add(sensor);
        dispositivos.add(luces);
        dispositivos.add(camara);
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo instanceof IActivable e){
                e.encender();
            }
            if (dispositivo instanceof IMantenimiento m){
                System.out.println(m.realizarTest());
            }
        }
    }
}
