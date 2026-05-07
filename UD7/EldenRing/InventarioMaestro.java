package EldenRing;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class InventarioMaestro {
    private HashMap<String, Arma> armas;
    public InventarioMaestro() {
        armas = new HashMap<>();
    }
    public boolean registrarArma(String codigo, Arma a) {
        if (armas.containsKey(codigo)) {
            System.out.println("Codigo repetido: " + codigo);
            return false;
        }
        armas.put(codigo, a);
        System.out.println("Arma registrada con exito " + codigo );
        return true;
    }
    public boolean mejorarArma(String codigo, int cantidad) {
        if (armas.containsKey(codigo)) {
            Arma a = armas.get(codigo);
            a.setAtaque(a.getAraque() + cantidad);
            armas.put(codigo, a);
            return true;
        }
        System.out.println("Arma no encontrada");
        return false;
    }
    public boolean mostrarArmaDaniada(){

        AtomicInteger count = new AtomicInteger();
        armas.forEach((codigo, arma) -> {
            if (arma.getDurabilidad() < 0.2){
                count.getAndIncrement();
                System.out.println("Codigo: " + codigo + " Arma: " + arma);
            }
        });
           if (count.get() > 0){
               return true;
           }else {
               return false;
           }
    }
    public boolean eliminarArma(String codigo){
        if (armas.containsKey(codigo)){
            armas.remove(codigo);
            return true;
        }
        System.out.println("Arma no encontrada");
        return false;
    }
    public void mostarInventarioMaestro(){
        armas.forEach((codigo, arma) -> {
            System.out.println( "Codigo: " +codigo + " " + arma);
        });
    }
}
