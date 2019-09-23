package netease;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by XXT on 2019/9/21.
 */
public class 最小数位和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(scanner.hasNext()){
            int num = scanner.nextInt();

            ArrayList<String> list = new ArrayList<String>();
            while(num - 9 > 0){
                num = num - 9;
                if(num > 9){
                    list.add("9");
                }else {
                    list.add("9");
                    list.add(Integer.toHexString(num));
                }
            }

            StringBuilder result = new StringBuilder();
            for (int i = list.size() - 1; i >= 0; i--) {
                result.append(list.get(i));
            }

            System.out.println(result.toString());
        }
    }
}
