package beike;

import java.util.Arrays;
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            int[] dp = new int[n];
            Arrays.fill(dp, 1);

            int cnt = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] > nums[i + 1] || nums[i] > nums[i - 1]){

                }
            }
            System.out.println(cnt);
        }
    }
}
