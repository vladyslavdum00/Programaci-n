public class P8E37 {
    public static void main(String[] args) {
        for (int mes = 1; mes <= 12; mes++){
            int dias = 0;
            switch (mes) {
                case 4: case 6: case 9: case 11:
                dias = 30;
                break;

                case 2:
                dias = 28;
                break;
                default:
                dias = 31;
            }
            for (int dia = 1; dia <= dias; dia++ ){
                System.out.println(dia +"/" +mes);
            }
        System.out.println();
        }
    }
}
