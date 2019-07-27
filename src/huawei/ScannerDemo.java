package huawei;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            if(num == 1){
                System.out.println(0);
            }
            if(num == 2){
                System.out.println(1);
            }
            if(num >= 3){
                int result = 0;
                while(num >= 3){
                    int a = num / 3;
                    int b = num % 3;
                    result += a;
                    num = a + b;
                }
                if(num == 2){
                    result++;
                }
                System.out.println(result);
            }
        }
    }

}
