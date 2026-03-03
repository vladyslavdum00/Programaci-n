package P6_1_3;

public class ProgramaAnimales {
    static void main(String[] args) {
        Animal a = new Animal();
        Pajaro p = new Pajaro();
        Pez pez = new Pez();
        PajaroCarpintero pc = new PajaroCarpintero();
        Gallo gallo = new Gallo();
        PezPayaso pezPayaso = new PezPayaso();
        PezEspada pezEspada = new PezEspada();

        System.out.println(a.cantar());
        System.out.println(p.cantar());
        System.out.println(pez.cantar());
        System.out.println(pc.cantar());
        System.out.println(gallo.cantar());
        System.out.println(pezPayaso.cantar());
        System.out.println(pezEspada.cantar());

    }
}
