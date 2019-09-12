package offer66;

public class No11旋转数组的最小数字 {
    public int minNumberInRotateArray(int [] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end){
            int mid = (start + end) / 2;
            if(array[start] >= array[mid]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return array[start];
    }
}
