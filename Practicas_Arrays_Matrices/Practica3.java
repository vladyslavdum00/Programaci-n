import java.util.Arrays;

public class Practica3 {
    public static void main(String[] args) {
        int[] nums = new int[6];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println(Arrays.toString(nums));
        int difMax = Math.abs(nums[0] - nums[1]);
        for (int j = 0; j < nums.length - 1; j++) {

            if (Math.abs(nums[j] - nums[j +1]) == difMax || Math.abs(nums[j] - nums[j +1]) > difMax) {
                difMax = Math.abs(nums[j] - nums[j +1]);
            }

        }
        System.out.println(difMax);


    }
}
