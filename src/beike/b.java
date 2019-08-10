package beike;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] nums = new int[50001];
            int[] dp = new int[50001];
            for (int i = 1; i <= n; i++) {
                nums[i] = scanner.nextInt();
            }


            int result = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i++) {
                dp[i] = 1;
                for (int j = 1; j < i; j++) {
                    if(nums[i] > nums[j] && dp[j] + 1 > dp[i]){
                        dp[i] = dp[j] + 1;
                    }
                }
                result = Math.max(result, dp[i]);
            }
            System.out.println(result);
        }
    }
}
