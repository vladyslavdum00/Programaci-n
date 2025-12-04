import java.util.Scanner;

public class U4_E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        declaraArray(sc);
    }

    static void declaraArray(Scanner sc){
        int [] array = new int[6];
        for (int i = 0; i < 6; i++){
            System.out.println("Dime el numero: ");
            int num = sc.nextInt();
            array[i] = num;
        }
        for (int j = 0; j < array.length; j++ ){
            System.out.println(array[j]);
        }
    }





}
