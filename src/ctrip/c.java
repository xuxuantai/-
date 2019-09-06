package ctrip;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class c {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
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
    /******************************结束写代码******************************/


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
