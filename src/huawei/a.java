package huawei;

import java.text.DecimalFormat;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] scores = new int[n];
            for (int i = 0; i < n; i++) {
                scores[i] = scanner.nextInt();
            }

            int q = scanner.nextInt();
            int[] nums = new int[q];
            for (int i = 0; i < q; i++) {
                nums[i] = scanner.nextInt();
            }

            for (int i = 0; i < q; i++) {
                int cnt = 0;
                for (int j = 0; j < scores.length; j++) {
                    if(scores[nums[i] - 1] >= scores[j]){
                        cnt++;
                    }
                }
                DecimalFormat df = new DecimalFormat("0.000000");
                double result = (double) (cnt - 1) / n * 100;
                System.out.println(df.format(result));
            }

        }
    }
}
