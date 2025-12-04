import java.util.Scanner;

public class P8E28 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int min = 1;
        int max = 100;
        String respuesta = "";

        System.out.println("Tienes que responde mayor,menor o igual.");




        do{
           int intento = (min + max) / 2;
           intento++;
           System.out.println("Es tu numero " +intento +"?");
            respuesta = leer.nextLine();
            if (respuesta.equals("menor")) {
                max = intento - 1;
            }else if (respuesta.equals("mayor")) {
                min = intento + 1;
            }else if (respuesta.equals("igual")){
                System.out.println("He adivinado tu numero");
                break;

            }

        }while(min <= max);
    }
}
