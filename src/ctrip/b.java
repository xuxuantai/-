package ctrip;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class b {


    /*������������������ʵ����ĿҪ��Ĺ���
    ��Ȼ����Ҳ���Բ������������ģ����������ȫ�����Լ����뷨�� ^-^
    ******************************��ʼд����******************************/
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
        /**---��ת��ɣ����Ǵ�����----**/
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
    /******************************����д����******************************/


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
