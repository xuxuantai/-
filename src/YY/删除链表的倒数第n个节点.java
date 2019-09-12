package YY;

import java.util.Scanner;

public class 删除链表的倒数第n个节点 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String input = scanner.next();
            int n = scanner.nextInt();
            String[] numStrs = input.split("->");
            if(n == 1){
                for (int i = 0; i < numStrs.length - 1; i++) {
                    if(i == numStrs.length - 2){
                        System.out.print(numStrs[i]);
                    }else{
                        System.out.print(numStrs[i] + "->");
                    }
                }
            }else if(numStrs.length < n){
                for (int i = 0; i < numStrs.length; i++) {
                    if(i == numStrs.length - 1){
                        System.out.print(numStrs[i]);
                    }else{
                        System.out.print(numStrs[i] + "->");
                    }

                }
            }else if(numStrs.length <= 1){
                System.out.println(numStrs[0]);
            }else{
                for (int i = 0; i < numStrs.length; i++) {
                    if(i == numStrs.length - 1){
                        System.out.print(numStrs[i]);
                    }else if(i != numStrs.length - n){
                        System.out.print(numStrs[i] + "->");
                    }

                }
            }


        }
    }
}
