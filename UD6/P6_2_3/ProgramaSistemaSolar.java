package P6_2_3;

public class ProgramaSistemaSolar {
    static void main(String[] args) {
        SistemaSolar s1 = new SistemaSolar("Sistema Solar");
        Planeta t = new Planeta("Tierra", 13, 26, 2000);
        Satelite l = new Satelite("Luna", 2, -50, 300000);
        Planeta v = new Planeta("Venera", 15, 200, 1000);
        Satelite tit = new Satelite("Titan", 7, 240, 25000);
        s1.addAstro(t);
        s1.addAstro(v);
        v.addAstro(tit);
        t.addAstro(l);
        s1.mostrarAstros();
        System.out.println();
        t.mostrarAstros();
        v.mostrarAstros();
    }
}
