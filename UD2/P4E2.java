public class P4E2 {
    public static void main(String[] args) {
        double cuenta = 2000;
        double anual = 2000 * 2.75/100;
        double medioaño = anual / 2;
        double CantidadFinal = cuenta + medioaño - (medioaño * 18/100);
        System.out.println(CantidadFinal);
    }
}
