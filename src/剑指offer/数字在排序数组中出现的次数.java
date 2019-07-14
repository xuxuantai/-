package 剑指offer;

/**
 * Created by LaoP on 2019/7/12.
 */
public class 数字在排序数组中出现的次数 {
    /**
     *有序数组就使用二分查找，找到第一个k和第一个k+1,w位置相减
     */
    public int GetNumberOfK(int [] array , int k) {
        int first = binarySearch(array, k);
        int last = binarySearch(array, k + 1);
        return last - first;
    }
    private int binarySearch(int[] array, int k){
        int start = 0;
        int end = array.length - 1;
        int mid = 0;
        while (start <= end){
            mid = start + (end - start)/2;
            //当mid大于等于k的时候就截取前半部分，最后start = end时，为第一个k
            if(array[mid] >= k){
                end = mid - 1;
            }else if(array[mid] < k){
                start = mid + 1;
            }
        }
        return start;
    }
}
