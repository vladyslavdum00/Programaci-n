import java.util.Arrays;
import java.util.Scanner;

public class U4_E16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums =  new int[12];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Dime un numero: ");
            nums[i] = sc.nextInt();
        }

        int tmp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] == 0) {
                    tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
