import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by XXT on 2019/9/15.
 */
public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            Arrays.sort(nums);

            if(n == 1){
                System.out.println(1);
            }
            if(n == 0){
                System.out.println(0);
            }
            int count = 1;
            int b = nums[1] - nums[0];
            for (int i = 1; i < n; i++) {
                int curb = nums[i] - nums[i - 1];
                if(curb == b){
                    count++;
                }else{
                    count = 0;
                    b = curb;
                }
            }
            System.out.println(count);

            
        }
    }
}
