package beike;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            long[] nums = new long[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            long a = nums[0];
            long b = nums[1];
            long minAbs = Math.abs(b - a);
            for (int i = 1; i < n - 1; i++) {
                long abs = Math.abs(nums[i + 1] - nums[i]);
                if(abs < minAbs){
                    a = nums[i];
                    b = nums[i + 1];
                    minAbs = Math.abs(b - a);
                }
            }
            System.out.println(a + " " + b);
        }
    }
}
