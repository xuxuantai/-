package ��ָoffer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ��ת����˳���� {

    /**
     * �ȷ�תÿ�����ʣ��ٷ�ת��������
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
         * ʹ��arr.toString()���ص��ǵ�ַ
         * ʹ��Arrays.toString(arr)���ص����ַ������͵��ַ�����
         * ���߶�����
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
