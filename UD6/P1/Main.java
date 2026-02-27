package P1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Artem", "Ovdiienko", "02/11/2006");
        Persona p2 = new Persona("Vlad", "Dumynsky",  "08/10/2004");
        Persona p3 = new Persona("Pablo", "Lopez", "25/02/2007");



        Profesor pf1 = new Profesor("Lionel", "Tarazon", "24/05/1979", 3000, "Programacion");
        Profesor pf2 = new Profesor("Pedro", "Garcia", "10/10/1975", 2500, "LM");
        Profesor pf3 = new Profesor("Raul", "Escribano", "12/03/1980", 4500, "SM");



        Alumno a1 = new Alumno("Samuel", "Gallego", "29/05/2005", "GradoSuperior", 7);
        Alumno a2 = new Alumno("Nela", "Fazuliyanova", "12/12/2002", "GradoSuperior", 8);
        Alumno a3 = new Alumno("Willam", "Thompson", "29/05/1985", "GradoSuperior", 4);



        Programa pg1 = new Programa();
        pg1.addPersona(p1);

        pg1.addPersona(p2);
        pg1.addPersona(p3);
        pg1.addPersona(pf1);
        pg1.addPersona(pf2);
        pg1.addPersona(pf3);
        pg1.addPersona(a1);
        pg1.addPersona(a2);
        pg1.addPersona(a3);

        pg1.mostrarPersonas();


    }
}
