import java.util.Scanner;

public class Main_Persona {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Persona persona1 = new Persona("1234", "artem", "ovd", 19);
        Persona persona2 = new Persona("5678", "pablo", "lop", 10);



        persona1.muestraDatos();
        persona2.muestraDatos();
        System.out.println(persona1.es_mayor_edad());
        System.out.println(persona2.es_mayor_edad());




    }
}
