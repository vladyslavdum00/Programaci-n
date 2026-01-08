import java.util.Arrays;

public class Practica7 {
    static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 5, 5, 8, 8};
        int[] sinDuplicados = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == sinDuplicados[j]) {
                    duplicate = true;
                }

            }
            if (!duplicate) {
                sinDuplicados[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(sinDuplicados));

    }




}
