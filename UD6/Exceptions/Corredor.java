package Exceptions;

public class Corredor {
    private int energia;
    public Corredor(int energia){
        setEnergia(energia);
    }
    public void setEnergia(int energia){
        this.energia = energia;
    }
    public int getEnergia(){
        return energia;
    }
    public void recargarEnergia(int energia){
        this.energia += energia;
    }
    public void correr()throws AgotadoException{
       if(energia >= 10){
           System.out.println("corriendo...");
           energia -= 10;
       }else{
           throw new AgotadoException("Agotado");
       }

    }
}
