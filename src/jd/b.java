package jd;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int result = 1;
        nums[0] = scanner.nextInt();
        int max = nums[0];

        for (int i = 1; i < n; i++) {
            nums[i] = scanner.nextInt();
            if(nums[i] > max){
                max = nums[i];
                result++;
            }
        }
        System.out.println(result);
    }
}
