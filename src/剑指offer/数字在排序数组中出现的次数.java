package ��ָoffer;

/**
 * Created by LaoP on 2019/7/12.
 */
public class ���������������г��ֵĴ��� {
    /**
     *���������ʹ�ö��ֲ��ң��ҵ���һ��k�͵�һ��k+1,wλ�����
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
            //��mid���ڵ���k��ʱ��ͽ�ȡǰ�벿�֣����start = endʱ��Ϊ��һ��k
            if(array[mid] >= k){
                end = mid - 1;
            }else if(array[mid] < k){
                start = mid + 1;
            }
        }
        return start;
    }
}
