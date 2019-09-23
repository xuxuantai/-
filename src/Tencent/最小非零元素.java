package Tencent;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by XXT on 2019/9/20.
 */
public class 最小非零元素 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            Arrays.sort(nums);
            //找到第一个非零元素
            int firstNumIndex = 0;
            for (int i = 0; i < n; i++) {
                if(nums[i] != 0){
                    firstNumIndex = i;
                    break;
                }
            }

            int sum = nums[firstNumIndex];
            System.out.println(sum);
            int chazhi = 0;
            for (int i = firstNumIndex + 1; i < k; i++) {
                if(nums[i] != nums[i - 1]){
                    chazhi = nums[i] - sum;//为之后相等的数补全用
                    System.out.println(nums[i] - sum);
                    sum += nums[i] - sum;
                }else{
                    System.out.println(nums[i] - sum + chazhi);
                }

            }

        }
    }
}
