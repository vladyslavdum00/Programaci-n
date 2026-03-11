package P6_3_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Lampara l = new Lampara(250);
        Coche c = new Coche(80, 5);
        Horno h = new Horno(1500);

        l.encender();
        l.apagar();
        System.out.println();
        c.encender();
        c.apagar();
        System.out.println();
        h.encender();
        h.apagar();
        System.out.println();
        ArrayList<IEncendible> interfase = new ArrayList<>();
        interfase.add(l);
        interfase.add(c);
        interfase.add(h);

        for (IEncendible i : interfase){
            i.encender();
        }

        for (IEncendible i : interfase){
            i.apagar();
        }

    }
}
