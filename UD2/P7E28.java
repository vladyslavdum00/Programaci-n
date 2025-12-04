import java.util.Scanner;

public class P7E28 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Dime el año: ");
        int año = leer.nextInt();

        System.out.print("Dime el mes (num): ");
        int mes = leer.nextInt();

        System.out.print("Dime el dia (num): ");
        int dia = leer.nextInt();

         boolean valid = false;

        if (mes >= 1 && mes <= 12 ){
            int diasmes;
        
        switch (mes) {
            case 2:
                diasmes = 28;
                break;
        
            case 4:
            case 6:
            case 9:
            diasmes = 30;
            break;

            default:
            diasmes = 31;
            break;

           
        }
        
           if (dia >= 1 && dia <= diasmes){
            valid = true;
           }
    
    
    
    }

           if (valid == true) {
            System.out.println("La fecha es valida");
           }
           


    
    
    }

}
