package Exceptions;

public class EntrenamientoMain {
    public static void main(String[] args) throws AgotadoException {
        Corredor corredor = new Corredor(50);
        for (int i = 0; i < 3; i++){
            boolean agotado = false;
            while (!agotado){
                try{
                    corredor.correr();
                    System.out.println("energia " + corredor.getEnergia());
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    agotado = true;
                }
            }
            if(i == 0){
                corredor.recargarEnergia(30);
            } else if (i == 1) {
                corredor.recargarEnergia(10);
            }
        }
    }
}
