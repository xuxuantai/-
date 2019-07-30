package ���������㷨;
import java.util.Arrays;

public class MergeSort {
    public int[] MergeSort(int[] nums){
        int mid = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid + 1, nums.length);
        /**
         * ���������ηֱ�ݹ�ʹ��MergeSort��Ȼ������������������ϲ���һ��
         */
        return merge(MergeSort(left), MergeSort(right));
    }

    private int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        int index = 0;
        for (int i = 0, j = 0; index < result.length; index++) {
            //���ж� i �� j �Ƿ��Ѿ�����
            if(i >= left.length){
                result[index] = right[j++];
            }else if(j >= right.length){
                result[index] = left[i++];
            }else if(left[i] > right[j]){
                //���ж��ĸ�С�ʹ��Ǹ���result[]
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
