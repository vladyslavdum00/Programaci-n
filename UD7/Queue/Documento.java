package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Documento {
    String nombre;
    int paginas;

    public Documento(String nombre, int paginas) {
        this.nombre = nombre;
        this.paginas = paginas;
    }
}

class Impresora {
    public static void main(String[] args) {
        Queue<Documento> colaImpresion = new LinkedList<>();

        colaImpresion.add(new Documento("Examen_Final.pdf", 10));
        colaImpresion.add(new Documento("Fotos_Vacaciones.jpg", 3));
        colaImpresion.add(new Documento("Contrato.docx", 5));

        while (!colaImpresion.isEmpty()) {
            Documento doc = colaImpresion.poll();
            System.out.println("Imprimiendo: " + doc.nombre + " (" + doc.paginas + " páginas)...");

            try {

                Thread.sleep(doc.paginas * 200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Finalizado: " + doc.nombre);
        }
        System.out.println("Cola de impresión vacía.");
    }
}
