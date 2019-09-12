package offer66;

public class No4二维数组中的查找 {
    public boolean Find(int target, int [][] array) {
        int rows = array.length - 1;
        int cols = array[0].length - 1;

        int r = 0;
        int c = cols;
        while(r <= rows && c >= 0){
            int currrentNum = array[r][c];
            if(currrentNum == target){
                return true;
            }
            if(currrentNum > target){
                c--;
            }else{
                r++;
            }
        }
        return false;
    }

}
