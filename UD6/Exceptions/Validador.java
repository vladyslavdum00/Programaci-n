package Exceptions;

public class Validador {
    public static void validar(String contrasenia) throws ContraseniaInseguraWxception{
        if(contrasenia.length() <=8){
            throw new ContraseniaInseguraWxception("Contraseña debe tener más o 8 caracteres");
        }
        boolean hayNumeros = false;
        for(int i = 0; i < contrasenia.length(); i++){
            if(Character.isDigit(contrasenia.charAt(i))){
                hayNumeros = true;
                break;
            }
        }
        if(!hayNumeros){
            throw new ContraseniaInseguraWxception("La contraseña debe tener por lo menos un numero ");
        }

        boolean mayuscula = false;
        boolean minuscula = false;
        for(int i = 0; i < contrasenia.length(); i++){
            if(Character.isLowerCase(contrasenia.charAt(i))){
                minuscula = true;
            }
            if(Character.isUpperCase(contrasenia.charAt(i))){
                mayuscula = true;
            }
            if(mayuscula && minuscula){
                break;
            }
        }
        if(!mayuscula){
            throw new ContraseniaInseguraWxception("La contraseña debe tener por lo menos una letra mayuscula");
        }
        if(!minuscula){
            throw new ContraseniaInseguraWxception("La contraseña debe tener por lo menos una letra minuscula");
        }
    }
}
