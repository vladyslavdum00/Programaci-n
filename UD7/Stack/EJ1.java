package Stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Cuantas veces has pulsado el boton: ");
//        int n = sc.nextInt();
//        Stack<String> s = new Stack<>();
//        s.push("Google");
//        s.push("Yahoo");
//        s.push("YouTube");
//        s.push("GitHub");
//        s.push("Netflix");
//        for (int i = 0; i < n; i++) {
//            System.out.println(s.pop());
//        }
//        System.out.println("Introduce la frase: ");
//        String frase = sc.nextLine();
//        Stack<String> stack = new Stack();
//        String[] array = frase.split(" ");
//        for (int i = 0; i < array.length; i++) {
//            stack.push(array[i]);
//        }
//
//        Iterator<String> it = stack.iterator();
//        while (it.hasNext()) {
//
//            System.out.println(stack.pop());
//
//        }
        System.out.println("Introduce exprecion matematica: ");
        String s =  sc.nextLine();
        System.out.println(validarStack(s));
        }

        static public Boolean validarStack(String s){
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '(' || c == '[') {
                    stack.push(c);
                }
                else if (c == ')' || c == ']') {
                    if (stack.isEmpty()) return false;

                    char ultimoAbierto = stack.pop();
                    if ((c == ')' && ultimoAbierto != '(') ||
                            (c == ']' && ultimoAbierto != '[')) {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }





    }
