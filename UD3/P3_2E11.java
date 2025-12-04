import java.util.Scanner;

public class P3_2E11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Dime el numero: ");
        int num = leer.nextInt();

        tablaMultiplicar(num);


    }


    public static void tablaMultiplicar(int num){
        int res = 1;
        for (int i = 1; i <= 10; i++){
            res = num * i;
            System.out.println(num +" " +"*" +" " +i +" " +"=" +" " +res);
        }
    }




}
