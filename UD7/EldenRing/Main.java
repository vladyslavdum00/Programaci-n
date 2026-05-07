package EldenRing;

public class Main {
    public static void main(String[] args) {
        Arma arma1 = new Arma("Espada", 10, 0.5);
        Arma arma2 = new Arma("BastonDeLuz", 12, 0.8);
        Arma arma3 = new Arma("BastonOscuro", 15, 0.1);
        Arma arma4 = new Arma("Lanza", 8, 0.9);
        Arma arma5 = new Arma("Arco", 11, 0.3);
        InventarioMaestro i = new InventarioMaestro();
        i.registrarArma("a1",arma1);
        i.registrarArma("a2",arma2);
        i.registrarArma("a3",arma3);
        i.registrarArma("a4",arma4);
        i.registrarArma("a5",arma5);
        i.mejorarArma("a1", 33);
        i.mejorarArma("aa", 33);
        i.mostrarArmaDaniada();
        i.mostarInventarioMaestro();
        i.eliminarArma("a3");
        i.mostarInventarioMaestro();

    }
}
