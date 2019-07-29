package 经典排序算法;

public class InsertionSort {
    public int[] InsertionSort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0 ; j--) {
                if(nums[i] < nums[j]){
                    //后移
                    nums[j + 1] = nums[j];
                }else{
                    //插入
                    nums[j + 1] = nums[i];
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {

    }
}
