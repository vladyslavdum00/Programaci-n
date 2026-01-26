package Agenda_de_Contactos;

public class Agenda {
   static final int MAX_size = 100;
    static int count = 0;
    static Contacto[] contactos = new Contacto[MAX_size];



public static void listarContactos(){
    if(count == 0){
        System.out.println("No hay contactos agregados");
    }else{
        for(int i = 0; i < count; i++){
            System.out.println(contactos[i].toString());
        }
    }
}

public static void agregarContacto(Contacto contacto){
   if (count < MAX_size){
       contactos[count] = contacto;
       count++;
   }else{
       System.out.println("No se ha agregado el contacto");
   }

}





}
