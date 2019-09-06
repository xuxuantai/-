package offer66;

public class No3数组中重复的数字 {

    public boolean duplicate(int numbers[],int length,int [] duplication) {
        for (int i = 0; i < length; i++) {
            while(numbers[i] != i){
                //一直与下标交换，直到遇到重复的
                if(numbers[i] == numbers[numbers[i]]){
                    duplication[0] = numbers[i];
                    return true;
                }
                swap(numbers, numbers[i], i);
            }
        }
        return false;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
