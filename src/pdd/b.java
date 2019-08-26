package pdd;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int l = scanner.nextInt();
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            Arrays.sort(nums);


            int cnt = 0;
            int start = nums[0];
            int end = nums[n - 1];

            int middle = (start + end) / 2;
            int newStart = middle - (n / 2);
            int newEnd = middle + (n / 2);

            for (int i = 0; i < n; i++, newStart++) {
                cnt += Math.abs(newStart - nums[i]);
            }
            System.out.println(cnt);
            
        }
    }
}
