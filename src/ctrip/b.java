package ctrip;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class b {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String resolve(String expr) {
        char[] chars = expr.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '('){
                start = i;
            }
            if(chars[i] == ')'){
                end = i;
                reverse(chars, start, end);
            }
        }
        /**---反转完成，但是带括号----**/
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char curChar = chars[i];
            if(curChar != '(' && curChar != ')'){
                sb.append(curChar);
            }
        }
        String result = sb.toString();
        return result;
    }
    private static void reverse(char[] arr, int i, int j){
        while(i < j){
            swap(arr, i++, j--);
        }
    }
    private static void swap(char[] arr, int i, int j){
        char temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _expr;
        try {
            _expr = in.nextLine();
        } catch (Exception e) {
            _expr = null;
        }

        res = resolve(_expr);
        System.out.println(res);
    }
}
