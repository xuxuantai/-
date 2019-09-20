import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by XXT on 2019/9/15.
 */
public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            if(n == 0){
                System.out.println(0);
                return;
            }
            int sum = 1;
            for (int i = 1; i <= n ; i++) {
                sum *= i;
            }

            String str = Integer.toString(sum);
            char[] chars = str.toCharArray();
            char lastChar = '0';
            for (int i = 0; i < chars.length; i++) {
                if(chars[i] != '0'){
                    lastChar = chars[i];
                }
            }
            System.out.println(lastChar);
        }
    }
}
