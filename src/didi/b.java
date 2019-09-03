package didi;

import java.util.Arrays;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int total = scanner.nextInt();
            int cost = scanner.nextInt();

            int[] nums1 = new int[n + 1];
            Arrays.fill(nums1, 0);
            int[] nums2 = new int[n + 1];
            Arrays.fill(nums2, 0);

            for (int i = 1; i < n + 1; i++) {
                nums1[i] = scanner.nextInt();
            }
            for (int i = 1; i < n + 1; i++) {
                nums2[i] = scanner.nextInt();
            }
            /**-----------数据初始化完成-------------**/

            int[][] c = new int[n + 1][n + 1];
            for (int row = 0; row <= n; row++) {
                c[row][0] = 0;
            }
            for (int column = 0; column <= n; column++) {
                c[0][column] = 0;
            }

            int sumCost = 0;
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    if(sumCost + cost > total){
                        break;
                    }
                    if(nums1[i] == nums2[j]){
                        c[i][j] = c[i - 1][j - 1] + 1;
                        sumCost += cost;
                    }else if(c[i][j - 1] > c[i - 1][j]){
                        c[i][j] = c[i][j - 1];
                    }else{
                        c[i][j] = c[i - 1][j];
                    }
                }
            }



        }
    }
}
