package ��ָoffer;

import java.util.ArrayList;

/**
 * Created by LaoP on 2019/7/8.
 */
public class ��С��K���� {
    public class Solution {
        public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
            ArrayList<Integer> result = new ArrayList<>();
            if(k > input.length){
                return result;
            }
            for(int i = 0; i < k; i++){
                for(int j = 0; j < input.length - 1 - i; j++){
                    if(input[j] < input[j + 1]){
                        int temp = input[j + 1];
                        input[j + 1] = input[j];
                        input[j] = temp;
                    }
                }
                //��������k��������
                result.add(input[input.length - 1 - i]);
            }
            return result;
        }
    }
}
