package P6_2_2;

import java.util.ArrayList;

public class ProgramaMascota {
    static void main(String[] args) {
        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Perro("Graf", 4, false));
        mascotas.add(new Gato("Murzik", 1, "nigga"));
        mascotas.add(new Canario("Kesha", 8, true));

        for(Mascota mascota: mascotas){
            mascota.habla();
            mascota.cumpleanios();
            System.out.println(mascota.toString());
        }
    }
}
