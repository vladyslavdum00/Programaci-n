package Agenda_de_Contactos;

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        setNombre(nombre);
        setTelefono(telefono);
        setEmail(email);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre != null && nombre.length() > 2) {
            this.nombre = nombre;
        }else{
            this.nombre = null;
        }
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        if  (telefono != null && telefono.length() == 9) {
            this.telefono = telefono;
        }else{
            this.telefono = null;
        }
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        for (int i = 0; i < email.length(); i++) {
            if (email.contains("@") && email.contains(".")) {
                this.email = email;
            }else{
                this.email = null;
            }
        }
    }

    public String toString() {
        return nombre + " " + telefono + " " + email;
    }

    public void print(){
        System.out.println(getNombre() + " " + getTelefono() + " " + getEmail());
    }

}
