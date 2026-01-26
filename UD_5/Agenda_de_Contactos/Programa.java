package Agenda_de_Contactos;

import java.util.Scanner;

public class Programa {
    static Scanner sc = new Scanner(System.in);
    static void main(String[] args) {

        System.out.println("Dime el nombre del contacto: ");
        String nombre = sc.nextLine();
        System.out.println("Dime el telefono del contacto: ");
        String telefono = sc.nextLine();
        System.out.println("Dime el email del contacto: ");
        String email = sc.nextLine();
        Contacto contacto = new Contacto(nombre, telefono, email);
        Agenda.agregarContacto(contacto);
        Agenda.listarContactos();




    }
}
