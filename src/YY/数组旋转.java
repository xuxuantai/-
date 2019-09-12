package YY;

import java.util.LinkedList;
import java.util.Scanner;

public class Êý×éÐý×ª {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            LinkedList<Integer> list = new LinkedList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(scanner.nextInt());
            }

            for (int i = m; i < n; i++) {
                if(i == n - 1){
                    System.out.print(list.get(i));
                }else{
                    System.out.print(list.get(i) + " ");
                }
            }
            for (int i = 0; i < m; i++) {
                if(m == n){
                    if(i == m - 1){
                        System.out.print(list.get(i));
                    }else{
                        System.out.print(list.get(i) + " ");
                    }
                }else{
                    System.out.print(" " + list.get(i));
                }
            }


        }
    }
}
