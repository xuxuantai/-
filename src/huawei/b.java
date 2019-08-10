package huawei;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            Arrays.sort(nums);

            String result = "YES";
            int pre = 0;
            int next = 0;
            for (int i = 0; i < n; i++) {
                if(i == 0){
                    pre = n - 1;
                    next = 1;
                }else if(i == n - 1){
                    pre = n - 2;
                    next = 0;
                }else{
                    pre = i - 1;
                    next = i + 1;
                }
                if(nums[i] >= nums[pre] + nums[next]){
                    result = "NO";
                }
            }
            System.out.println(result);


        }
    }
}
