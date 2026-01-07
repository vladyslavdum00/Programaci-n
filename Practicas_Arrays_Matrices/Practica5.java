import java.util.Arrays;

public class Practica5 {
    public static void main(String[] args) {
        int[] nums = new int[15];
        int[] seRepite = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 10) + 1;
        }
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            int contador = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    contador++;

                }
            }
            seRepite[i] = contador;
        }
        System.out.println(Arrays.toString(seRepite));
        int max = seRepite[0];
        int position = 0;
        for (int i = 0; i < seRepite.length; i++) {
           if (seRepite[i] > max) {
               max = seRepite[i];
               position = i;
           }
        }
        String mostrada = "";
        for (int j = 0; j < seRepite.length; j++) {
            if (seRepite[j] == max && !mostrada.contains(" " +nums[j] +" ")) {
                System.out.println(nums[j] + " Se repite " + seRepite[j] + " veces");
                mostrada += " " + nums[j] + " ";
            }
        }

    }
}
