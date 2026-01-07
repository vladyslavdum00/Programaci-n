import java.util.Arrays;
import java.util.Collections;

public class Practica4 {
    static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1};
       CompruebaPalindromo(array);
    }

    static void CompruebaPalindromo(int[] array){
        int[] test =  new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            test[array.length - 1 - i] = array[i];
        }
        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.equals(test, array));
    }



}
