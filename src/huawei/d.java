package huawei;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int q = scanner.nextInt();

            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            Arrays.sort(nums);

            int[] qNums = new int[q];
            for (int i = 0; i < q; i++) {
                qNums[i] = scanner.nextInt();
            }

            for (int i = 0; i < q; i++) {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    if(qNums[i] <= nums[j]){
                        nums[j]--;
                        cnt++;
                    }
                }
                System.out.println(cnt);
            }



        }
    }
}
