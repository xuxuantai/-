package ctrip;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class c {


    /*������������������ʵ����ĿҪ��Ĺ���
    ��Ȼ����Ҳ���Բ������������ģ����������ȫ�����Լ����뷨�� ^-^
    ******************************��ʼд����******************************/
    static int schedule(int m,int[] array) {
        int start = 1;
        int end = 2;
        int min = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int[] ms = new int[m];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }

        return min + max;

    }

    private static int getSum(int[] nums, int i, int j){
        int sum = 0;
        for (int k = i; k < j; k++) {
            sum += nums[k];
        }
        return sum;
    }
    /******************************����д����******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int size  = in.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        int res = schedule(m,array);
        System.out.println(String.valueOf(res));
    }
}
