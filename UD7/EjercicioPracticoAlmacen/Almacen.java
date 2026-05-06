package EjercicioPracticoAlmacen;

import java.util.HashMap;

public class Almacen {
    private HashMap<Componente, Integer> almacen;
    public Almacen() {
        almacen = new HashMap<>();
    }
    public void anadirComponente(Componente componente, int cantidad){
        almacen.put(componente, almacen.getOrDefault(componente, 0)+cantidad);
    }
    public void venderComponente(Componente componente, int cantidad) throws StockInsuficienteException{
        if (!almacen.containsKey(componente)) {
            throw new StockInsuficienteException("Componente no encontrado");
        }


        int stockActual = almacen.get(componente);


        if (stockActual < cantidad) {
            throw new StockInsuficienteException("No hay componentes suficientes");
        }

        // 4. Si todo está bien, actualizamos
        almacen.put(componente, stockActual - cantidad);
    }
    public void mostrarStock(){
        almacen.forEach((componente, cantidad) -> {

            System.out.println(componente + " - " + cantidad);
        });
    }
}
