package huawei;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.next();
            char[] chars = s.toCharArray();
            int result = 0;
            int a = 0;
            for (int i = chars.length - 1; i >= 2; i--) {
                int b = 0;
                if(chars[i] - 'A' >= 0){
                    b = (chars[i] - '0' - 7);
                }else{
                    b = (chars[i] - '0');
                }
                result += b * Math.pow(16, a++);
            }
            System.out.println(result);
        }
    }
}
