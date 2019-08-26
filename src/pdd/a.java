package pdd;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            Arrays.sort(nums);


            double minVarience = Double.MAX_VALUE;
//            for (int a = 0; a < n; a++) {
////                for (int b = a + 1; b < n; b++) {
////                    for (int c = b + 1; c < n; c++) {
////                        double temp = (nums[a] + nums[b] + nums[c]) / 3;
////                        double pow1 = Math.pow(nums[a] - temp, 2);
////                        double pow2 = Math.pow(nums[b] - temp, 2);
////                        double pow3 = Math.pow(nums[c] - temp, 2);
////                        double varience = (pow1 + pow2 + pow3) / 3;
////                        if(varience < minVarience){
////                            minVarience = varience;
////                        }
////                    }
////                }
////            }

            for (int a = 0; a + 2 < n; a++) {
                double temp = (nums[a] + nums[a + 1] + nums[a + 2]) / 3;
                double pow1 = Math.pow(nums[a] - temp, 2);
                double pow2 = Math.pow(nums[a + 1] - temp, 2);
                double pow3 = Math.pow(nums[a + 2] - temp, 2);
                double varience = (pow1 + pow2 + pow3) / 3;
                if(varience < minVarience){
                    minVarience = varience;
                }
            }
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format(minVarience));
        }
    }
}
