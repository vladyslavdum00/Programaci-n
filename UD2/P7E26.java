import java.util.Scanner;

public class P7E26 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Crea el login: ");
        String login = leer.next();

        System.out.print("Crea la contraseña: ");
        String contraseña = leer.next();

        System.out.print("Introduce tu login de usuario: ");
        String login2 = leer.next();

        System.out.println("Introduce tu contraseña de usuario: ");
        String contraseña2 = leer.next();

        if (login2.equals(login) && contraseña2.equals(contraseña)){
            System.out.println("Inicio de sesion correcto");
        }else if (login2 != login && contraseña2.equals(contraseña)){
            System.out.println("El login incorrecto");
        }else if (contraseña2 != contraseña && login2.equals(login)) {
            System.out.println("La contraseña es incorrecta");
        }else {
            System.out.println("Login y contraseña son incorrectos");
        }
    }
}
