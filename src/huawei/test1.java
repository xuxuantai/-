package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String number = scanner.next();
            //×ª16½øÖÆ
            int n = Integer.parseInt(number, 16);
            List<String> strList = new ArrayList<String>();
            for (int i = 0; i < n - 1; i++) {
                strList.add(scanner.next());
            }

            int newN = n;
            for (int i = 0; i < n - 1; i++) {
                String str = strList.get(i);
                if("A".equals(str)){
                    newN++;
                }else if("B".equals(str)){
                    newN++;
                }
            }

            String numOx = Integer.toHexString(newN).toUpperCase();
            System.out.print(numOx + " ");
            for (int i = 0; i < n - 1; i++) {
                String str = strList.get(i);
                if("A".equals(str)){
                    System.out.print("12 34 ");
                }else if("B".equals(str)){
                    System.out.print("AB CD ");
                }else {
                    System.out.print(str + " ");
                }
            }


        }

    }
}
