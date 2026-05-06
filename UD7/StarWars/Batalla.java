package StarWars;

import java.util.ArrayList;

public class Batalla {
    public static void main(String[] args) {
        ArrayList<Maestro> maestros = new ArrayList<>();
        maestros.add(new Jedi("Yoda", 50, 10));
        maestros.add(new Jedi("Obi-Wan", 80, 7));
        maestros.add(new Sith("Vader", 100, 9));
        maestros.add(new Sith("Dooku", 70, 7));
        for (Maestro m : maestros){
            System.out.println(m);
        }
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();
        Maestro leon = new Jedi("LEON", 20, 7);
        Maestro zack = new Sith("ZACK", 20, 8);
        System.out.println(leon);
        System.out.println(zack);
        for(int i = 1; i <= 3; i++){
            System.out.println("### TURNO " + i);
            leon.atacar(zack);
            zack.atacar(leon);
            System.out.println(leon);
            System.out.println(zack);
        }
    }
}
