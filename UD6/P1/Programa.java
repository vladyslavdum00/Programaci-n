package P1;

import java.util.ArrayList;

public class Programa {
    private ArrayList<Persona> personas;
    public Programa() {
        setPersonas(new ArrayList<>());
    }
    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public void addPersona(Persona persona) {
        personas.add(persona);
    }

    public void mostrarPersonas() {
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }

}

