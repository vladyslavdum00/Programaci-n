import java.util.Scanner;

public class Juego2 {
    public static void main(String[] args) {
        
        Scanner leer  = new Scanner(System.in);
        
        String palabra = "";
      char reemplazo = '_';
      String pOculta = "";
      

      int intentos = 6;

     

      System.out.print("Dime la palabra: ");
      palabra = leer.nextLine();

      
      
      
      
      
      
      
      for (int i = 0; i < palabra.length(); i++){
        pOculta += reemplazo;
      }
      
      
      System.out.println("Ahorcado(palabra): " + pOculta);
      
      System.out.println("Intentos restantes: " +intentos);
      
      
      
      
        
        
        do{
          System.out.println("Dime la letra: ");
        char letra = leer.next().toLowerCase().charAt(0);

          
        String resultado = "";
        boolean correcto = false;

      
      
      for (int j = 0; j < palabra.length(); j++){
    
        if (palabra.charAt(j) == letra){

          resultado += letra;

          correcto = true;
         

        }else{
          resultado += pOculta.charAt(j);
        }
    
    
    
    }
      
      pOculta = resultado;

      if (correcto != true){
        intentos--;
        System.out.println("MAL: " + pOculta);
        System.out.println("Intentos restantes: " +intentos);
      }else{
        System.out.println("BIEN: " +pOculta);
        System.out.println("Intentos restantes: " +intentos);
      }
        } while (!pOculta.equals(palabra) && intentos > 0);
      
      
      if (pOculta.equals(palabra)) {
      System.out.println("Felicidades has adivinado palabra " +palabra.toUpperCase());
    }else if (intentos == 0){
      System.out.println("Has perdido :( no tienes más intentos");
    }
      }
    
    
    
    }
  
