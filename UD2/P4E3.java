public class P4E3 {
    public static void main(String[] args) {
        double CantidadInicial = 2000;
        double anual = 2000 * 2.75/100;
        double Intereses9meses = (anual / 4) * 3;
        double retencion = (Intereses9meses * 18/100);
        double InteresNeto = Intereses9meses - (Intereses9meses * 18/100);
        double CantidadFinal = CantidadInicial + InteresNeto;
        System.out.println("Cantidad Inicial: " + CantidadInicial);
        System.out.println("Intereses anuales: " + anual);
        System.out.println("Intereses a los 9 meses: " + Intereses9meses);
        System.out.println("Retención Hacienda: " + retencion);
        System.out.println("Interes neto: " + InteresNeto);
        System.out.println("Cantidad Final: " + CantidadFinal);
    }
}
