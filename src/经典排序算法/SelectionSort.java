package 经典排序算法;

public class SelectionSort {
    /**
     * 1.首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
     *
     * 2. 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
     *
     * 3. 重复第二步，直到所有元素均排序完毕。
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
