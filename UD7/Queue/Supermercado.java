package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Supermercado {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();


        cola.add("Ana");
        cola.add("Pedro");
        cola.add("Marta");
        cola.add("Juan");
        cola.add("Lucía");


        System.out.println("Atendiendo a: " + cola.poll());
        System.out.println("Atendiendo a: " + cola.poll());


        cola.add("Roberto");


        System.out.println("Siguiente en la cola: " + cola.peek());

        System.out.println("Estado actual de la cola: " + cola);
    }
}
