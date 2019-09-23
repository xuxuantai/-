package duxiaoman;

import java.util.Scanner;

/**
 * Created by XXT on 2019/9/21.
 */
public class 滑动窗口最大值 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int sum = 0;
            for (int i = a; i <= n; i++) {
                for (int j = b; j <= m; j++) {
                    sum += (n * (j - 1) + i) % 10;
                }
            }

            System.out.println(sum);
        }
    }
}
