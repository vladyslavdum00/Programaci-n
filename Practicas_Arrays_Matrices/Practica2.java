import java.util.Arrays;

public class Practica2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 6, 8};
        int[] nums2 = {1, 3, 5, 7, 8};
        int[] distintos = new int[10];
        int contador = 0;

        for (int i = 0; i < nums1.length; i++) {
            boolean existe = false;
            for (int j = 0; j < contador; j++) {
               if (nums1[i] == distintos[j]) {
                   existe = true;

               }
            }
            if (!existe) {
                distintos[contador] = nums1[i];
                contador++;
            }

        }

        for (int i = 0; i < nums2.length; i++) {
            boolean existe = false;
            for (int j = 0; j < contador; j++) {
                if (nums2[i] == distintos[j]) {
                    existe = true;

                }
            }
            if (!existe) {
                distintos[contador] = nums2[i];
                contador++;
            }

        }

        System.out.println("nums1: " + Arrays.toString(distintos));

    }
}
