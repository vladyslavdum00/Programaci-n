package Exceptions;

import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        try {
            enviarMensaje("@.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    static void enviarMensaje(String cadena) throws Exception{
        if(!cadena.isEmpty()){
            boolean formatoA = false;
            boolean formatoB = false;
            if(cadena.contains("@")){

                for(int i = 0; i < cadena.length() - 1; i++){
                    if(cadena.charAt(i) == '@'){
                        if(cadena.charAt(i+1) != ' ' && cadena.charAt(i+1) != '@' && cadena.charAt(0) != '@' && cadena.charAt(0) != '.'){
                            formatoA = true;
                        }

                    }
                    if(cadena.charAt(i) == '.'){
                        if(cadena.charAt(i-1) != ' ' && cadena.charAt(i+1) != ' ' && cadena.charAt(i-1) != '@' && cadena.charAt(i+1) != '@'){
                            formatoB = true;
                        }
                    }

                }
                if(formatoA && formatoB){
                    throw new Exception("El correo es valido");
                }else{
                    throw new Exception("El correo debe contener caracteres entre @ y . y despues del .; La @ y el . no puedes ser como el primer caracter del correo");
                }
            }else{
                throw new Exception("El correo debe tener @");
            }

        }else {
            throw new Exception("No se puede texto vacio");
        }

    }
}
