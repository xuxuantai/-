package 数据结构算法;

/**
 * Created by LaoP on 2019/3/5.
 */

public class 二维数组的查找 {
    /**
     * 题目描述
     给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
     *解题思路
     要求时间复杂度 O(M + N)，空间复杂度 O(1)。
     该二维数组中的一个数，它左边的数都比它小，下边的数都比它大。
     因此，从右上角开始查找，就可以根据 target 和当前元素的大小关系来缩小查找区间，当前元素的查找区间为左下角的所有元素。
     */
    public boolean Find(int target, int [][] matrix){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return true;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int r = 1;
        int c = cols - 1;
        while(r <= rows - 1 && c >= 0){
            if(target > matrix[r][c]){
                r++;
            }else if(target < matrix[r][c]){
                c--;
            }else if(target == matrix[r][c]){
                return true;
            }
        }
        return false;
    }

}
