package 经典排序算法;

public class QuickSort {
    /**
     * 一个基准即首位，头尾两个指针向中间推进，交换key与left
     */

    public int[] QuickSort(int[] nums, int start, int end){
        int key = start;
        int left = start;
        int right = end;

        //双指针继续往中间推，直到left >= right
        while (left < right){
            //right从右往左找到第一个小于key的数
            while(left < right && nums[right] >= nums[key]){
                right--;
            }
            //left从左往右找到第一个大于key的数
            while (left < right && nums[left] <= nums[key]){
                left++;
            }
            //交换nums[left]和nums[right]
            if(left < right){
                swap(nums, left, right);
            }
        }

        //交换nums[key]与nums[left]的数值,
        //形成left左边都比nums[left]小，left右边都比nums[left]大
        swap(nums, key, left);
        //递归的对left的左边与left的右边两个数组进行快排
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