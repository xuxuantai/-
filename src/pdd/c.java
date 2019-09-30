package pdd;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by XXT on 2019/9/25.
 */
public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();

            String result = new String();

            ArrayList<String> list = new ArrayList<String>();


            if(k <= n){
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < k; i++) {
                    sb.append("a");
                    if(!list.contains(sb.toString())){
                        list.add(sb.toString());
                    }
                }
            }else if(k > n && k <= n + m){
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    sb.append("a");
                    if(!list.contains(sb.toString())){
                        list.add(sb.toString());
                    }
                }
                for (int j = n; j < k; j++) {
                    sb.append("b");
                    if(!list.contains(sb.toString())){
                        list.add(sb.toString());
                    }
                }
            }else if(k > n + m){
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    sb.append("a");
                    if(!list.contains(sb.toString())){
                        list.add(sb.toString());
                    }
                }
                for (int j = n; j < n + m; j++) {
                    sb.append("b");
                    if(!list.contains(sb.toString())){
                        list.add(sb.toString());
                    }
                }
            }else{
                for (int i = n + m; i < k; i++) {
                    list.add("a");
                }
            }
            result = list.get(k - 1);
            System.out.println(result);

        }
    }
}
