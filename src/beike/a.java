package beike;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.next();
            String[] strings = str.split(",");


            String temp = strings[0];
            int count = 1;
            for (int i = 1; i < strings.length; i++) {
                if(!temp.equals(strings[i])){
                    count++;
                    temp = strings[i];
                }
            }
            System.out.println(count);

        }
    }
}
