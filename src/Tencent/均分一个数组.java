package Tencent;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by XXT on 2019/9/20.
 */
public class 均分一个数组 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] nums = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
                sum += nums[i];
            }

            int weight = sum / 2;
            int[][] dp = new int[n + 1][weight + 1];

            for (int i = 1; i <= n; i++) {
//                Arrays.fill(dp[i], 0);
                for (int j = 1; j <= weight; j++) {
                    if(j < nums[i - 1]){
                        dp[i][j] = dp[i - 1][j];
                    }else{
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - nums[i - 1]] + nums[i - 1]);
                    }
                }
            }

            int small = dp[n][weight];
            int big = sum - small;

            System.out.println(small + " " + big);


        }
    }

}
