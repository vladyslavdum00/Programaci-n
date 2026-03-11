package FinalFantasy_V2;
import Final_Fantasy.HechiseroOscuro;

import java.util.ArrayList;
import java.util.Random;

public class Batalla {
    static void main(String[] args) {
        Random random = new Random();
        ArrayList<Personaje> equipo = new  ArrayList<>();
        Ballestero b = new Ballestero("Ballestero", 100, 10, 10);
        Bardo bardo = new Bardo("Bardo", 100, 10, 10);
        Caballero cab = new Caballero("Caballero", 100, 10, 10);
        Paladin paladin = new Paladin("Paladin", 100, 10, 10);
        HechiceroDeLuz luz = new HechiceroDeLuz("HechiceroDeLuz", 100, 10, 10, 100);
        HechiceroOscuro oscuro = new HechiceroOscuro("HechiceroOscuro", 100, 10, 10, 100);
        equipo.add(b);
        equipo.add(bardo);
        equipo.add(cab);
        equipo.add(paladin);
        equipo.add(luz);
        equipo.add(oscuro);

        for (int turno = 1; turno <= 15; turno++) {

            System.out.println("\n----- TURNO " + turno + " -----");

            Personaje atacante;
            Personaje defensor;


            do {
                atacante = equipo.get(random.nextInt(equipo.size()));
            } while (!atacante.estaVivo());


            do {
                defensor = equipo.get(random.nextInt(equipo.size()));
            } while (!defensor.estaVivo() || defensor == atacante);
            System.out.println("Datos del atacante: " + atacante +"\n");
            System.out.println("Datos del defensor: " + defensor +"\n");
            System.out.println(atacante.nombre + " ataca a " + defensor.nombre +"\n");

            if (atacante instanceof Mago && Math.random() < 0.65) {
                System.out.println("Usa habilidad especial!");
                Mago mago = (Mago) atacante;
                mago.habilidadEspecial(defensor);
                System.out.println("Datos despues del uso de habilidad especial: " +"\n");
                System.out.println("Datos del defensor: " + defensor +"\n");
            } else {
                atacante.atacar(defensor);
                System.out.println("Datos despues del ataque: " +"\n");
                System.out.println("Datos del defensor: " + defensor +"\n");
            }

            if (!defensor.estaVivo()) {
                System.out.println(defensor.nombre + " ha muerto!");
            }
        }
    }
}
