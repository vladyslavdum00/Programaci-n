import java.util.Arrays;

public class Practica8 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {10, 20, 30};
        int[] nums3 = new int[nums1.length + nums2.length];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            nums3[i] = nums1[i];
            k++;
        }
        int j = 0;
        for (int i = k; i < nums3.length; i++) {
            nums3[i] = nums2[j];
            j++;

        }
        System.out.println(Arrays.toString(nums3));
    }
}
