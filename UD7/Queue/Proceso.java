package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Proceso {
    String nombre;
    int tiempoEjecucion;

    public Proceso(String nombre, int tiempoEjecucion) {
        this.nombre = nombre;
        this.tiempoEjecucion = tiempoEjecucion;
    }
}

class PlanificadorCPU {
    public static void main(String[] args) {
        Queue<Proceso> colaProcesos = new LinkedList<>();
        int quantum = 2;

        colaProcesos.add(new Proceso("P1", 5));
        colaProcesos.add(new Proceso("P2", 2));
        colaProcesos.add(new Proceso("P3", 4));

        while (!colaProcesos.isEmpty()) {
            Proceso p = colaProcesos.poll();
            System.out.print("Ejecutando " + p.nombre + " (Tiempo restante: " + p.tiempoEjecucion + "s) -> ");

            p.tiempoEjecucion -= quantum;

            if (p.tiempoEjecucion > 0) {
                System.out.println("No terminado, vuelve a la cola.");
                colaProcesos.add(p);
            } else {
                System.out.println("TERMINADO.");
            }

            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
        System.out.println("Todos los procesos han sido completados.");
    }
}
