package 剑指offer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 翻转单词顺序列 {

    /**
     * 先反转每个单词，再反转整个句子
     */
    public String ReverseSentence(String str) {
        int len = str.length();
        char[] arr = str.toCharArray();
        int i = 0;
        for (int j = 0; j <= len; j++) {
            if(j == len || arr[j] == ' '){
                reverse(arr, i, j - 1);
                i = j + 1;
            }
        }
        reverse(arr, 0 , len - 1);
        /**
         * 使用arr.toString()返回的是地址
         * 使用Arrays.toString(arr)返回的是字符串类型的字符数组
         * 二者都不行
         */
        return new String(arr);
    }

    private void reverse(char[] arr, int i, int j){
        while(i < j){
            swap(arr, i++, j--);
        }
    }
    private void swap(char[] arr, int i, int j){
        char temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
