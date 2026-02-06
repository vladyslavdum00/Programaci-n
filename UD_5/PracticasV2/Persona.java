package PracticasV2;

import Banco1.Cuenta;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Persona conyuge;
    private Persona progenitorA;
    private Persona progenitorB;
    ArrayList<Persona> hermanos = new ArrayList<Persona>();
    ArrayList<Persona> hijos = new ArrayList<Persona>();


    public Persona(String nombre, String apellido, int edad) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona getConyuge() {
        return conyuge;
    }

    public void setConyuge(Persona conyuge) {
        this.conyuge = conyuge;
        conyuge.conyuge = this;
    }

    public Persona getProgenitorA() {
        return progenitorA;
    }

    public void setProgenitorA(Persona progenitorA) {
        this.progenitorA = progenitorA;
    }

    public Persona getProgenitorB() {
        return progenitorB;
    }

    public void setProgenitorB(Persona progenitorB) {
        this.progenitorB = progenitorB;
    }

    public void addHijo(Persona hijo) {
        if (hijo.getProgenitorA() == null) {
            hijo.setProgenitorA(this);
        }else if (hijo.getProgenitorB() == null && hijo.getProgenitorA() != this) {
            hijo.setProgenitorB(this);
        }


        if (this.conyuge != null && hijo.getProgenitorB() == null && hijo.getProgenitorA() != this.conyuge) {
            hijo.setProgenitorB(this.conyuge);
            if(!this.conyuge.hijos.contains(hijo)){
                this.conyuge.hijos.add(hijo);
            }

        }

        for (Persona hij : this.hijos) {
            if (hij != hijo) {
                if (!hijo.hermanos.contains(hij)) {
                    hijo.hermanos.add(hij);
                }
                if (!hij.hermanos.contains(hijo)) {
                    hij.hermanos.add(hijo);
                }
            }
        }

        if (!this.hijos.contains(hijo)) {
            this.hijos.add(hijo);
        }
    }

    public void addHermano(Persona hermano) {




        if (this.progenitorA == null) {
            this.progenitorA = hermano.progenitorA;
        }
        if (this.progenitorB == null) {
            this.progenitorB = hermano.progenitorB;
        }


        if (!this.hermanos.contains(hermano)) {
            this.hermanos.add(hermano);
            hermano.hermanos.add(this);
        }
        for (Persona h : hermano.hermanos) {
            if (h != this && !this.hermanos.contains(h)) {
                this.hermanos.add(h);
                h.hermanos.add(this);
            }
        }


        if (this.progenitorB != null && !this.progenitorB.hijos.contains(this)) {
            this.progenitorB.hijos.add(this);
        }
        if (this.progenitorA != null && !this.progenitorA.hijos.contains(this)) {
            this.progenitorA.hijos.add(this);
        }


    }

    public void printHijos() {
        for (int i = 0; i < this.hijos.size(); i++) {
            System.out.println(this.hijos.get(i).getNombre() + " " + this.hijos.get(i).getApellido());
        }
    }

    public void printHermanos() {
        for (int i = 0; i < this.hermanos.size(); i++) {
            System.out.println(this.hermanos.get(i).getNombre() + " " + this.hermanos.get(i).getApellido());
        }
    }

    public void printInfoFamilia() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
       if (getConyuge() != null) {
           System.out.println("Conyuge: " + getConyuge().getNombre() +  " " + getConyuge().getApellido());
       }else{
           System.out.println("Conyuge: sin conyuge");
       }

        if (getProgenitorA() != null && getProgenitorB() == null) {
            System.out.println("Progenitor: " + getProgenitorA().getNombre() + " " + getProgenitorA().getApellido() + " " + "Progenitor: sin progenitor");
        } else if (getProgenitorA() == null && getProgenitorB() != null) {
            System.out.println("Progenitor: sin progenitor " + "Progenitor: " + getProgenitorA().getNombre() + " " + getProgenitorA().getApellido());
        } else if (getProgenitorA() != null && getProgenitorB() != null) {
            System.out.println("Progenitor: " + getProgenitorA().getNombre() + " " + getProgenitorA().getApellido() + " " + "Progenitor: " + getProgenitorB().getNombre() + " " + getProgenitorB().getApellido());
        } else {
            System.out.println("Progenitor: sin progenitor Progenitor: sin progenitor");
        }
        if (!hermanos.isEmpty()) {
            System.out.println("Hermanos: ");
            printHermanos();
            System.out.println();
        } else {
            System.out.println("Hermanos: sin hermanos");
            System.out.println();
        }
        if (!hijos.isEmpty()) {
            System.out.println("Hijos: ");
            printHijos();
            System.out.println();
        } else {
            System.out.println("Hijos: sin hijos");
            System.out.println();
        }

    }
}
