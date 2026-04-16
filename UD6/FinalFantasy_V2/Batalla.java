package FinalFantasy_V2;
import java.util.ArrayList;
import java.util.Random;

public class Batalla {
    public static void main(String[] args) {
        Random random = new Random();
        boolean turnoEquipo1 = true;
        ArrayList<Personaje> aliados = new ArrayList<>();
        ArrayList<Personaje> equipo1 = new  ArrayList<>();
        ArrayList<Personaje> equipo2 = new  ArrayList<>();
        Ballestero b1 = new Ballestero("Ballestero1", 100, 10, 10);
        Bardo bardo1 = new Bardo("Bardo1", 100, 10, 10);
        Caballero cab1 = new Caballero("Caballero1", 100, 10, 10);
        Paladin paladin1 = new Paladin("Paladin1", 100, 10, 10);
        HechiceroDeLuz luz1 = new HechiceroDeLuz("HechiceroDeLuz1", 100, 10, 10, 100);
        HechiceroOscuro oscuro1 = new HechiceroOscuro("HechiceroOscuro1", 100, 10, 10, 100);

        equipo1.add(b1);
        equipo1.add(bardo1);
        equipo1.add(cab1);
        equipo1.add(paladin1);
        equipo1.add(luz1);
        equipo1.add(oscuro1);

        Ballestero b2 = new Ballestero("Ballestero2", 100, 10, 10);
        Bardo bardo2 = new Bardo("Bardo2", 100, 10, 10);
        Caballero cab2 = new Caballero("Caballero2", 100, 10, 10);
        Paladin paladin2 = new Paladin("Paladin2", 100, 10, 10);
        HechiceroDeLuz luz2 = new HechiceroDeLuz("HechiceroDeLuz2", 100, 10, 10, 100);
        HechiceroOscuro oscuro2 = new HechiceroOscuro("HechiceroOscuro2", 100, 10, 10, 100);

        equipo2.add(b2);
        equipo2.add(bardo2);
        equipo2.add(cab2);
        equipo2.add(paladin2);
        equipo2.add(luz2);
        equipo2.add(oscuro2);

        Personaje atacante;
        Personaje defensor;


        for (int turno = 1; turno <= 200; turno++) {
            ArrayList<Personaje> equipoAtacante;
            ArrayList<Personaje> equipoDefensor;
            if (equipo1.isEmpty() || equipo2.isEmpty()) {
                System.out.println("¡LA BATALLA HA TERMINADO!");
                String ganador = equipo1.isEmpty() ? "Equipo 2" : "Equipo 1";
                System.out.println("Ganador: " + ganador);
                break;
            }

            if (turnoEquipo1) {
                equipoAtacante = equipo1;
                equipoDefensor = equipo2;
            } else {
                equipoAtacante = equipo2;
                equipoDefensor = equipo1;
            }


            System.out.println("\n----- TURNO " + turno + " -----");

            do {
                atacante = equipoAtacante.get(random.nextInt(equipoAtacante.size()));
                defensor = equipoDefensor.get(random.nextInt(equipoDefensor.size()));
            } while (!atacante.estaVivo() || !defensor.estaVivo());

            aliados = equipoAtacante;
            System.out.println("Datos del atacante: " + atacante +"\n");
            System.out.println("Datos del defensor: " + defensor +"\n");
            System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre() +"\n");

            if (atacante instanceof Paladin) {
                turnoPaladin(defensor, aliados, (Paladin) atacante);
                System.out.println("Datos despues del ataque: " +"\n");
                System.out.println("Datos del defensor: " + defensor +"\n");
            } else if (atacante instanceof HechiceroDeLuz) {
               turnoHechiseroDeLuz(defensor, aliados, (HechiceroDeLuz) atacante);
                System.out.println("Datos despues del ataque: " +"\n");
                System.out.println("Datos del defensor: " + defensor +"\n");
            }else if (atacante instanceof HechiceroOscuro) {
                turnoHechiseroOscuro(defensor, aliados, (HechiceroOscuro) atacante);
                System.out.println("Datos despues del ataque: " +"\n");
                System.out.println("Datos del defensor: " + defensor +"\n");
            }else{
                atacante.atacar(defensor);
                System.out.println("Datos despues del ataque: " +"\n");
                System.out.println("Datos del defensor: " + defensor +"\n");
            }
            if (!defensor.estaVivo()) {
                System.out.println(defensor.getNombre() + " ha muerto!");
            }



            turnoEquipo1 = !turnoEquipo1;
            if (!equipoAtacante.isEmpty()) {
                for (Personaje personaje : equipoAtacante) {
                    if (personaje.vida == 0){
                        equipoAtacante.remove(personaje);
                    }
                }
            }
            if (!equipoDefensor.isEmpty()) {
                for (Personaje personaje : equipoDefensor) {
                    if (personaje.vida == 0){
                        equipoDefensor.remove(personaje);
                    }
                }
            }
            System.out.println(equipoAtacante.size());
            System.out.println(equipoDefensor.size());
        }


    }
    static Personaje personajeHerido(ArrayList<Personaje> aliados) {
        Personaje aliadoHerido = null;
        for (Personaje aliado : aliados) {
            if (aliado.estaVivo() && aliado.getVida() < 100) {
                aliadoHerido = aliado;
                break;
            }
        }
        return aliadoHerido;
    }

    static void turnoPaladin(Personaje defensor, ArrayList<Personaje> aliados, Paladin paladin) {
        double posibilidad = Math.random();
        Personaje aliadoHerido = personajeHerido(aliados);
        if (posibilidad < 0.45 && aliadoHerido != null) {
           paladin.sanar(aliadoHerido);
            System.out.println(paladin.getNombre() + " sana a " + aliadoHerido.getNombre());
            }else if (posibilidad < 0.66) {
            paladin.habilidadBuff(aliados);
        }else{
            paladin.atacar(defensor);
        }
    }

    static void turnoHechiseroDeLuz(Personaje defensor,  ArrayList<Personaje> aliados, HechiceroDeLuz hechiceroDeLuz) {
        Personaje aliadoHerido = personajeHerido(aliados);
        double posibilidad = Math.random();
        if (posibilidad < 0.45 && aliadoHerido != null) {
            hechiceroDeLuz.sanar(aliadoHerido);
            System.out.println(hechiceroDeLuz.getNombre() + " sana a " + aliadoHerido.getNombre());
        }else if (posibilidad < 0.66) {
            System.out.println("Usa habilidad especial!");
            hechiceroDeLuz.habilidadEspecial(defensor);
        }else{
            hechiceroDeLuz.atacar(defensor);
        }
    }

    static void turnoHechiseroOscuro(Personaje defensor, ArrayList<Personaje> aliados, HechiceroOscuro hechiceroOscuro) {
        double posibilidad = Math.random();
        if (posibilidad < 0.45) {
           hechiceroOscuro.habilidadBuff(aliados);
        }else if (posibilidad < 0.66) {
            System.out.println("Usa habilidad especial!");
            hechiceroOscuro.habilidadEspecial(defensor);
        }else{
            hechiceroOscuro.atacar(defensor);
        }
    }
}
