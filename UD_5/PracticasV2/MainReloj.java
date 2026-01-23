package PracticasV2;

public class MainReloj {
    public static void main(String[] args) {
    Reloj reloj1 = new Reloj(0, 0, 0);


       for (int i = 1; i <= 3800; i++){
           reloj1.tick();
       }
        reloj1.imprimeHora24();
        System.out.println(reloj1.dimeHora12());
    }
}
