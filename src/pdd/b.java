package pdd;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[][] nums = new int[2][k];
            for (int i = 0; i < k; i++) {
                nums[0][i] = scanner.nextInt();
                nums[1][i] = scanner.nextInt();
            }

            boolean[] isTree = new boolean[n];
            Arrays.fill(isTree, false);

            int result = 0;
            for (int i = 0; i < k; i++) {
                int start = nums[0][i] - 1;
                int end = nums[1][i] - 1;
                for (int j = start; j <= end; j++) {
                    if(!isTree[j]){
                        //如果当前位置未植树，则植树数++
                        result++;
                        isTree[j] = true;
                    }
                }
                //打印当前植树数
                System.out.println(result);
            }

            
        }
    }
}
