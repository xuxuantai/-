package ��ָoffer;

import java.util.ArrayList;
import java.util.Arrays;

public class ��ΪS���������� {

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int i = 0;
        int j = array.length - 1;
        int cur;

        while(i < j){
            cur = array[i] + array[j];
            if(cur == sum){
                return new ArrayList<Integer>(Arrays.asList(array[i],array[j]));
            }
            if(cur > sum){
                j--;
            }else{
                i++;
            }

        }
        return new ArrayList<Integer>();
    }
}
