public class P4E7 {
    public static void main(String[] args) {
     double D = 15.5;
     double r = D / 2;
     double h = 42.4;
     double AreaBases = 2 * 3.14 * (r * r);
     double AreaLateral = 2 * 3.14 * r * h;
     double Areatotal  = AreaBases + AreaLateral;
     double V = 3.14 * (r*r) * h;
     System.out.println("Alto: " + h);
     System.out.println("Diametro: " + D);
     System.out.println("Area: " + Areatotal);
     System.out.println("Volumen: " + V);

    }
}
