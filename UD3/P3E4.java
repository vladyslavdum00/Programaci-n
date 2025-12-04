import java.util.Scanner;

public class P3E4 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);

       System.out.println("Dime el numero: ");
       int a = leer.nextInt();

       System.out.println("Signo: " +dimeSigno(a));


}

public static int dimeSigno(int a){
    if (a == 0){
        return 0;
    }else if (a > 0){
        return 1;
    }else{
        return -1;
    }
}

}
