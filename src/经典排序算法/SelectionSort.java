package ���������㷨;

public class SelectionSort {
    /**
     * 1.������δ�����������ҵ���С����Ԫ�أ���ŵ��������е���ʼλ�á�
     *
     * 2. �ٴ�ʣ��δ����Ԫ���м���Ѱ����С����Ԫ�أ�Ȼ��ŵ����������е�ĩβ��
     *
     * 3. �ظ��ڶ�����ֱ������Ԫ�ؾ�������ϡ�
     * @param nums
     * @return
     */
    public int[] SelectionSort(int[] nums){
        int minIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {

    }
}
