package vivo;

/**
 * ±¨Êý
 */

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Welcome to vivo !
 */

public class P2 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dis = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        int times = 0;
        int next = 0;
        HashSet<Integer> set = new HashSet<>();
        while (times < n) {
            int step  = 0;
            next = (next + 1 + n) % n;
            while (!set.contains(next) && step) {

            }
            if (!set.contains(next)) {
                sb.append(next).append(" ");
                set.add(next);
            }

        }
    }

    private static int[] parseInts(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new int[0];
        }
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }

    private static String solution(int[] input) {
        int n = input.length;


        return null;
    }

}