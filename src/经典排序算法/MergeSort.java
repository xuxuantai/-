package 经典排序算法;
import java.util.Arrays;

public class MergeSort {
    public int[] MergeSort(int[] nums){
        int mid = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid + 1, nums.length);
        /**
         * 对左右两段分别递归使用MergeSort，然后将左右两个有序数组合并成一个
         */
        return merge(MergeSort(left), MergeSort(right));
    }

    private int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        int index = 0;
        for (int i = 0, j = 0; index < result.length; index++) {
            //先判断 i 或 j 是否已经读完
            if(i >= left.length){
                result[index] = right[j++];
            }else if(j >= right.length){
                result[index] = left[i++];
            }else if(left[i] > right[j]){
                //再判断哪个小就存那个进result[]
                result[index] = right[j++];
            }else if(left[i] <= right[j]){
                result[index] = left[i++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
    }
}
