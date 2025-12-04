import java.util.Scanner;

public class ejMetodosbase {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Dime el numero A: ");
        int a = leer.nextInt();

      
        System.out.print("Dime el numero B: ");
        int b = leer.nextInt();
        

        //System.out.println("Par o No par: " +dicePar(a));


        //imprimirTablamultiplica(a, b);

        //imprimirMenu(a);





}
    public static int multiplica(int a, int b){
        return a * b;
    }
    
    
    public static void imprimirTablamultiplica(int a, int b){
        int res = 1;
        System.out.println("Tabla de multiplicación: ");
        for (int i = 1; i <= b; i++){
            res = multiplica(a, i);
            System.out.println(a +" " +"*" +" " +i +" " +"=" +" " +res);
        }
    }
    
    
    public static boolean dicePar(int a){

        if (a%2 == 0){
            return true;
        }else{
            return false;
        }
    }
        

        
        public static void imprimirMenu(int a){
            for (int i = 1; i <= a; i++){
                if (i != a){
                    System.out.println("Opcion " +i);
                }else{
                    System.out.println("Salir");
                    break;
                }
            }
                






}













