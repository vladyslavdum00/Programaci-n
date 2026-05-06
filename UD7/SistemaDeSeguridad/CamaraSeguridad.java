package SistemaDeSeguridad;

import EjercicioPracticoAlmacen.Componente;

public class CamaraSeguridad extends Dispositivo implements IActivable, IMantenimiento {
    public CamaraSeguridad(int id, String modelo) {
        super(id,modelo);

    }
    @Override
    public void encender() {
        System.out.println("Camara grabando...");
    }
    @Override
    public void apagar() {
        System.out.println("Camara apagando...");
    }
    @Override
    public boolean realizarTest() {
        return Math.random() < 0.1;
    }
}
