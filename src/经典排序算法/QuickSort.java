package ���������㷨;

public class QuickSort {
    /**
     * һ����׼����λ��ͷβ����ָ�����м��ƽ�������key��left
     */

    public int[] QuickSort(int[] nums, int start, int end){
        int key = start;
        int left = start;
        int right = end;

        //˫ָ��������м��ƣ�ֱ��left >= right
        while (left < right){
            //right���������ҵ���һ��С��key����
            while(left < right && nums[right] >= nums[key]){
                right--;
            }
            //left���������ҵ���һ������key����
            while (left < right && nums[left] <= nums[key]){
                left++;
            }
            //����nums[left]��nums[right]
            if(left < right){
                swap(nums, left, right);
            }
        }

        //����nums[key]��nums[left]����ֵ,
        //�γ�left��߶���nums[left]С��left�ұ߶���nums[left]��
        swap(nums, key, left);
        //�ݹ�Ķ�left�������left���ұ�����������п���
        QuickSort(nums, start, left - 1);
        QuickSort(nums, left + 1, end);

        return nums;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {

    }
}