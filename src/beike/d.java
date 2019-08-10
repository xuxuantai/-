package beike;

import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            int a = 1;
            int b = n - 2;
            int cnt = 0;
            while(a <= b){
                if(nums[a] <= nums[a - 1]){
                    cnt += nums[a - 1] + 1 - nums[a];
                    nums[a] = nums[a - 1] + 1;
                }
                if(a == b){
                    break;
                }
                if(nums[b] <= nums[b + 1]){
                    cnt += nums[b + 1] + 1 - nums[b];
                    nums[b] = nums[b + 1] + 1;
                }
                a++;
                b--;
            }
            if(a != b && nums[a] == nums[b]){
                cnt++;
                nums[a]++;
            }
            System.out.println(cnt);

        }
    }
}
