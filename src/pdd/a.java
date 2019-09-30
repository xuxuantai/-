package pdd;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            Arrays.sort(nums);

            long result = 0;
            if(k == 1){
                result = nums[0] * nums[1];
            }else{
                int start = 0;
                int end = n - 1;
                for (int i = 0; i < k; i++) {
                    while(start < end){
                        result += nums[start] * nums[end];
                        start++;
                        end--;
                    }
                }
            }

            System.out.println(result);



        }
    }
}
