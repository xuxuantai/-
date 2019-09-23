package Tencent;

import java.util.Scanner;

/**
 * Created by XXT on 2019/9/20.
 */
public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while(scanner.hasNext()) {
            String result = "NO";
            long n = scanner.nextLong();
            String str = scanner.next();
            if(n < 11){
                result = "NO";
            }else if(n == 11 && str.charAt(0) == '8'){
                result = "YES";
            }else{
                int indexOfFirst8 = 0;
                for (int i = 0; i < n - 11; i++) {
                    if(str.charAt(i) == '8'){
                        indexOfFirst8 = i;
                        break;
                    }
                }
                if(n - indexOfFirst8 >= 11){
                    result = "YES";
                }else{
                    result = "NO";
                }
            }
            System.out.println(result);

        }
    }
}
