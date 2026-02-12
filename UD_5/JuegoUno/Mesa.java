package JuegoUno;

import java.util.ArrayList;
import java.util.Collections;

public class Mesa {
    private  ArrayList<Carta> mazo;
    private  ArrayList<Carta> descarte;
    public Mesa() {
        this.mazo = new ArrayList<>();
        this.descarte = new ArrayList<>();
        generarCarta();
        barajarMazo();
        toString();
    }
    public  void barajarMazo() {
        Collections.shuffle(mazo);
    }

    public void printMazo(){
       for(int i = 0; i <getMazo().size() ; i++){
           System.out.println(mazo.get(i).toString());
      }
   }

    public  ArrayList<Carta> getMazo() {
        return mazo;
    }

    public  void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }
    public  ArrayList<Carta> getDescarte() {
        return descarte;
    }
    public  void setDescarte(ArrayList<Carta> descarte) {
        this.descarte = descarte;    }

    public  void generarCarta() {

        for (Color color : Color.values()) {

            if (color == Color.NEGRO) {

                // 4 +4 y 4 cambia color
                for (int i = 0; i < 4; i++) {
                    mazo.add(new Carta(color, TipoCarta.MAS_CUATRO, -1));
                    mazo.add(new Carta(color, TipoCarta.CAMBIA_COLOR, -1));
                }

            } else {

                // 1 carta 0
                mazo.add(new Carta(color, TipoCarta.NUMERO, 0));

                // 2 cartas de cada número del 1 al 9
                for (int i = 1; i <= 9; i++) {
                    mazo.add(new Carta(color, TipoCarta.NUMERO, i));
                    mazo.add(new Carta(color, TipoCarta.NUMERO, i));
                }

                // 2 cartas especiales por color
                for (int i = 0; i < 2; i++) {
                   mazo.add(new Carta(color, TipoCarta.MAS_DOS, -1));
                    mazo.add(new Carta(color, TipoCarta.SKIP, -1));
                    mazo.add(new Carta(color, TipoCarta.REVERSA, -1));
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "mazo=" + mazo +
                '}';
    }
}
