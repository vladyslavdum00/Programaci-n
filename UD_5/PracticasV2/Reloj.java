package PracticasV2;

public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;
    public Reloj(){
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }
    public Reloj(int hora, int minutos, int segundos){
        setHora(hora);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public void setHora(int hora){
       if(hora >= 0 && hora <= 24){
           this.hora = hora;
       }else {
           System.out.println("Hora no valido");
       }
    }
    public void setMinutos(int minutos){
        if(minutos >= 0 && minutos <= 59){
            this.minutos = minutos;
        }else  {
            System.out.println("Minutos no valido");
        }
    }
    public void setSegundos(int segundos){
        if(segundos >= 0 && segundos <= 59){
            this.segundos = segundos;
        }else   {
            System.out.println("Segundos no valido");
        }
    }
    public int getHora(){
        return this.hora;
    }
    public int getMinutos(){
        return this.minutos;
    }
    public int getSegundos(){
        return this.segundos;
    }

    public void setReloj(int hora, int minutos, int segundos){
        setHora(hora);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public String dimeHora(){
        return  getHora() + ":" + getMinutos() + ":" + getSegundos();
    }

    public String dimeHora12(){
        if(hora > 12){
            return getHora() - 12 + "pm" + ":" + getMinutos() + ":" + getSegundos();
        }
        return  getHora() + "am" + ":" + getMinutos() + ":" + getSegundos();
    }

    public void imprimeHora24(){
        System.out.println(dimeHora());
    }

    public void imprimeHora12(){
        System.out.println(dimeHora12());
    }

    public void tick(){
     this.segundos++;
     if(this.segundos == 60){
         this.segundos = 0;
         this.minutos++;

         if (this.minutos == 60){
             this.minutos = 0;
             this.hora++;
         }
         if (this.hora == 24){
             this.hora = 0;
         }
     }



    }



}
