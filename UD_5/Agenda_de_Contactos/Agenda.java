package Agenda_de_Contactos;

import java.util.Scanner;

public class Agenda {
   static final int MAX_size = 100;
    static int count = 0;
    static Contacto[] contactos = new Contacto[MAX_size];



public static void listarContactos(){
    if(count == 0){
        System.out.println("No hay contactos agregados");
    }else{
        for(int i = 0; i < count; i++){
            System.out.println(i + "." + " " +contactos[i].toString());
        }
    }
}


public static void menuAgenda(){

        System.out.println("======================================");
        System.out.println("      MENU / AGENDA DE CONTACTOS      ");
        System.out.println("======================================");
        System.out.println();
        System.out.println("1. Listar contactos");
        System.out.println("2. Agregar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Buscar por nombre");
        System.out.println("5. Buscar por el telefono");
        System.out.println("6. Buscar por el  email");
        System.out.println("7. Busqueda general");
        System.out.println("0. Salir");

}






public static void agregarContacto(Contacto contacto){
   if (count < MAX_size){
       contactos[count] = contacto;
       count++;
   }else{
       System.out.println("No se ha agregado el contacto");
   }

}

public static void buscarPorNombre(String nombre){
    boolean encontrado = false;
    for(int i = 0; i < count; i++){
        String nom = contactos[i].getNombre().toLowerCase();
        if (nom.contains(nombre)){
            System.out.println(contactos[i].toString());
            encontrado = true;

        }
    }
    if(!encontrado){
        System.out.println("Contacto no encontrado");
    }
}
    public static void buscarPorTelefono(String telefono){
        boolean encontrado = false;
        for(int i = 0; i < count; i++){
            String tel = contactos[i].getTelefono().toLowerCase();
            if (tel.contains(telefono)){
                System.out.println(contactos[i].toString());
                encontrado = true;

            }
        }
        if(!encontrado){
            System.out.println("Contacto no encontrado");
        }
    }
    public static void buscarPorEmail(String email){
        boolean encontrado = false;
        for(int i = 0; i < count; i++){
            String mail = contactos[i].getEmail().toLowerCase();
            if (mail.contains(email)){
                System.out.println(contactos[i].toString());
                encontrado = true;

            }
        }
        if(!encontrado){
            System.out.println("Contacto no encontrado");
        }
    }
    public static void busquedaGeneral(String t){
        boolean encontrado = false;
        for(int i = 0; i < count; i++){
            if (contactos[i].getTelefono().toLowerCase().contains(t) || contactos[i].getEmail().toLowerCase().contains(t) || contactos[i].getNombre().toLowerCase().contains(t)){
                System.out.println(contactos[i].toString());
                encontrado = true;

            }
        }
        if(!encontrado){
            System.out.println("Contacto no encontrado");
        }
    }

public static void eliminarContacto(int num){
    if(contactos[num] == null){
        System.out.println("Contacto no existe");
    }else {
        for(int i = num; i < count - 1; i++){
            contactos[i] = contactos[i+1];
        }
        contactos[count-1] = null;
        count--;
        System.out.println("Contacto eliminado");


    }
}

}
