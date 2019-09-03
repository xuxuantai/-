package pdd;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class d2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();

            int[] nums = new int[n * m];
            int index = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    nums[index] = (i + 1) * (j + 1);
                    index++;
                }
            }
            Arrays.sort(nums);
            if(k < nums.length){
                System.out.println(nums[nums.length - k]);
            }else{
                System.out.println(nums[nums.length - k]);
            }


        }
    }
}
