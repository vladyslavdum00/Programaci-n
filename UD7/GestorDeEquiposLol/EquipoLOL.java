package GestorDeEquiposLol;

import java.util.ArrayList;

public class EquipoLOL {
    private String nombre;
    private ArrayList<String> jugadores;
    public EquipoLOL(String nombre) throws Exception  {

        setNombre(nombre);

        this.jugadores = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) throws Exception {
        if (nombre == null || nombre.length() < 3) {
            throw new EquipoLolException("Nombre del equipo no valido.");
        }else this.nombre = nombre;
    }
    public ArrayList<String> getJugadores() {
        return jugadores;
    }
    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }

    //metodos

    public void ficharJugador(String nombre) throws Exception {
        if (nombre == null || nombre.length() < 3) {
            throw new EquipoLolException("Nombre de jugador no valido.");
        }
        if (jugadores.contains(nombre.toLowerCase())) {
            throw new EquipoLolException("Jugador cone el nombre: " + nombre + " ya existe.");
        }
        if (jugadores.size() == 5) {
            throw new EquipoLolException("El equipo ya esta lleno.");
        }
        jugadores.add(nombre.toLowerCase());
    }

    public void expulsarJugador(String nombre) throws Exception {
        if (nombre == null || nombre.length() < 3) {
            throw new EquipoLolException("Nombre de jugador no valido.");
        }
        if (!jugadores.contains(nombre.toLowerCase())) {
            throw new EquipoLolException("Jugador con el nombre: " + nombre +" no existe.");
        }
        jugadores.remove(nombre.toLowerCase());
    }
    public void cambiarPosicion(int actual, int nuevo) throws Exception {
        if (actual < 1 || nuevo < 1 || actual > 5 || nuevo > 5) {
            throw new EquipoLolException("Posicion no valida.");
        }
        String posN = jugadores.get(nuevo - 1);
        String posA = jugadores.get(actual - 1);
        jugadores.remove(nuevo - 1);
        jugadores.add(nuevo - 1, posA);
        jugadores.remove(actual - 1);
        jugadores.add(actual - 1, posN);
    }
    public void mostrarAlineacion() throws Exception {
        if (jugadores.isEmpty()) {
            throw new EquipoLolException("Equipo vacio.");
        }
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println((i + 1) + ". " + jugadores.get(i));
        }
    }
    public void jugar() throws Exception {
        if (jugadores.size() != 5) {
            String num = String.valueOf(5 - jugadores.size());
            throw new EquipoLolException("Equipo vacio. Faltan " + num +" jugadores");
        }else System.out.println("Jugando...");

    }

    public static void main(String[] args) {
        try {
            EquipoLOL equipo = new EquipoLOL("ostias");
            equipo.ficharJugador("Vlad");
            equipo.ficharJugador("Artem");
            equipo.ficharJugador("Pablo");
            equipo.ficharJugador("Nela");
            equipo.ficharJugador("Samuel");
            equipo.mostrarAlineacion();
            System.out.println("--------------");
            equipo.cambiarPosicion(1, 5);
            equipo.mostrarAlineacion();
            System.out.println("-----------------");
            equipo.jugar();
            equipo.expulsarJugador("samuel");
            equipo.mostrarAlineacion();
            equipo.jugar();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
