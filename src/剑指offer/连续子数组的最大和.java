package 剑指offer;

/**
 * Created by LaoP on 2019/7/8.
 */
public class 连续子数组的最大和 {
    public class Solution {
        public int FindGreatestSumOfSubArray(int[] array) {
            int greatestSum = Integer.MIN_VALUE;
            int sum = 0;
            for(int i = 0; i < array.length; i++){
                if(sum <= 0){
                    sum = array[i];
                }else {
                    sum += array[i];
                }
                greatestSum = Math.max(sum,greatestSum);
            }
            return greatestSum;
        }
    }
}
