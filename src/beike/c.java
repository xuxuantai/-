package beike;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            int min = 0;
            int max = 0;
            int cnt = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if(nums[i] > nums[j]){
                        min = nums[j];
                        max = nums[i];
                    }else{
                        min = nums[i];
                        max = nums[j];
                    }
                    if(min * 10 >= max * 9){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
