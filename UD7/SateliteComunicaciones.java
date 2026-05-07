import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SateliteComunicaciones {
    Deque<String> colaMensajes = new LinkedList<>();
    Stack<String> mensajes = new Stack<>();
    public SateliteComunicaciones(){};

    public void recibirMensaje(String mensaje) throws Exception{
        if (mensaje.isEmpty()){
            throw new Exception("El mensaje no puede estar vacio");
        }else {
           colaMensajes.add(mensaje);
        }
    }
    public boolean procesarSiguiente(){
        if (colaMensajes.isEmpty()){
            System.out.println("No hay mensajes pendientes");
            return false;
        }
        String mensaje = colaMensajes.remove();
        System.out.println("Procesando el mensaje: " + mensaje);
        mensajes.push(mensaje);
        return true;

    }
    public boolean deshacerUltimo(){
        if (mensajes.isEmpty()){
            System.out.println("No hay nada para deshacer");
            return false;
        }
        colaMensajes.addFirst(mensajes.pop());
        return true;
    }
    public void verEstado(){
        System.out.println("Mensajes en la cola: " + colaMensajes);
        System.out.println("Historial de procesados: " + mensajes);
    }

    static void main(String[] args) {
        SateliteComunicaciones s = new SateliteComunicaciones();
        try {
            s.recibirMensaje("Artemka228 chupapolla");
            s.recibirMensaje("Pablo loh");
            s.recibirMensaje("Maria Shluha");
            s.verEstado();
            System.out.println(s.procesarSiguiente());
            System.out.println(s.procesarSiguiente());
            s.verEstado();
            System.out.println(s.deshacerUltimo());
            s.verEstado();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
