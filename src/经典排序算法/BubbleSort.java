package ���������㷨;

public class BubbleSort {
    /**
     * 1. �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
     *
     * 2. ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ��ⲽ���������Ԫ�ػ�����������
     *
     * 3. ������е�Ԫ���ظ����ϵĲ��裬�������һ����
     *
     * 4. ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ�
     * @param nums
     * @return
     */
    public int[] BubbleSort(int[] nums){
        for (int cnt = 0; cnt < nums.length; cnt++) {
            for (int i = 0; i < nums.length - cnt - 1; i++) {
                if(nums[i] > nums[i + 1]){
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {

    }
}
