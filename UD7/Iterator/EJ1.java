package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class EJ1 {
    public static void main(String[] args) {
//        ArrayList<String> nombres = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            nombres.add("PEPE" + (i+1));
//        }
//        Iterator<String> it = nombres.iterator();
//        while (it.hasNext()) {
//            String nom = it.next();
//            System.out.println(nom);
//        }

//        ArrayList<Integer> nums = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            int num = (int) (Math.random() * 10) + 1;
//            nums.add(num);
//        }
//        for (int i = 0; i < nums.size(); i++) {
//            System.out.println(nums.get(i));
//        }
//
//        Iterator<Integer> it = nums.iterator();
//        while (it.hasNext()) {
//            if (it.next() < 5) {
//                it.remove();
//            }
//        }
//        System.out.println("---------------------------------");
//        for (int i = 0; i < nums.size(); i++) {
//            System.out.println(nums.get(i));
//        }
        class Alumno{
            private String nombre;
            private int nota;

            public Alumno(String nombre, int nota){
                setNombre(nombre);
                setNota(nota);
            }
            public String getNombre(){
                return this.nombre;
            }
            public int getNota(){
                return this.nota;
            }
            public void setNombre(String nombre){
                this.nombre = nombre;
            }
            public void setNota(int nota){
                this.nota = nota;
            }

        }
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Artem", 10));
        alumnos.add(new Alumno("Pablo", 4));
        alumnos.add(new Alumno("Nela", 3));
        alumnos.add(new Alumno("Sanuel", 7));
        alumnos.add(new Alumno("Wiliam", 3));

        Iterator<Alumno> it = alumnos.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            if(a.getNota()==4){
                a.setNota(5);
            } else if (a.getNota() < 4) {
                it.remove();
            }
        }
        for(Alumno a : alumnos){
            System.out.println(a.getNombre());
            System.out.println(a.getNota());
            System.out.println("-------------");
        }
    }
}
