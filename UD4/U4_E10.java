import java.util.Random;

public class U4_E10 {
    public static void main(String[] args) {
        int [] nums = new int[10];
        int [] numsClone = new int[10];

        for (int i = 0; i < nums.length; i++){
            int num = (int) (Math.random() * 50) +1;
            nums[i] = num;
            System.out.println("Real: " + nums[i]);

        }

        for (int i = 0; i < numsClone.length; i++){
        numsClone[i] = nums[i];
        System.out.println("Clone: " +numsClone[i]);

        }



    }


}
