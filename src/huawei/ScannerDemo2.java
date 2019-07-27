package huawei;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int length = scanner.nextInt();
            int[] num = new int[length];
            num[0] = scanner.nextInt();

            for (int i = 1; i < length; i++) {
                num[i] = scanner.nextInt();
            }

            Arrays.sort(num);

            System.out.println(num[0]);
            for (int i = 1; i < length; i++) {
                if(num[i] != num[i - 1]){
                    System.out.println(num[i]);
                }
            }

        }

    }
}
