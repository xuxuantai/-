package 剑指offer;

public class 调整数组顺序使奇数位于偶数前面 {

    public class Solution {
        public void reOrderArray(int [] array) {
            //奇数的个数
            int oddcnt = 0;
            for(int x : array){
                if(isodd(x)){
                    oddcnt++;
                }
            }

            int[] copy = array.clone();
            int i = 0;
            int j = oddcnt;
            for(int x : copy){
                if(isodd(x)){
                    array[i++] = x;
                }else {
                    array[j++] = x;
                }
            }
        }
        private boolean isodd(int x){
            return x % 2 == 0 ? false : true;
        }
    }
}
