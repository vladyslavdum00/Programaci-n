package FinalFantasy_V2;
import java.util.ArrayList;
import java.util.Random;

public class Batalla {
    static void main(String[] args) {
        Random random = new Random();
        ArrayList<Personaje> equipo = new  ArrayList<>();

        for (int turno = 1; turno <= 15; turno++) {

            System.out.println("\n----- TURNO " + turno + " -----");

            Personaje atacante;
            Personaje objetivo;


            do {
                atacante = equipo.get(random.nextInt(equipo.size()));
            } while (!atacante.estaVivo());


            do {
                objetivo = equipo.get(random.nextInt(equipo.size()));
            } while (!objetivo.estaVivo() || objetivo == atacante);

            System.out.println(atacante + " ataca a " + objetivo);


            if (atacante instanceof Mago && Math.random() < 0.30) {

                System.out.println("Usa habilidad especial!");

                Mago mago = (Mago) atacante;
                mago.habilidadEspecial(objetivo);

            } else {

                atacante.atacar(objetivo);
            }

            if (!objetivo.estaVivo()) {
                System.out.println(objetivo.nombre + " ha muerto!");
            }
        }
    }
}
