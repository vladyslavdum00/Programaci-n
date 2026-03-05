package P6_2_3;

import java.util.ArrayList;

public abstract class Astro extends SistemaSolar{

    protected double masa;
    protected double temperaturaMedia;

    public Astro(String nombre, double masa, double temperaturaMedia){
        super(nombre);
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
    }

}
