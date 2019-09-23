package netease;

import java.util.Scanner;

/**
 * Created by XXT on 2019/9/21.
 */
public class ÄæĞò¶Ô¾àÀëÖ®ºÍ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if(nums[j] < nums[i]){
                        sum += Math.abs(nums[i] - nums[j]);
                    }
                }
            }

            System.out.println(sum);
        }
    }
}
