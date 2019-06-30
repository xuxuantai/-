package 剑指offer;

/**
 * Created by LaoP on 2019/6/30.
 */
public class 矩阵中的路径 {
    public class Solution {
        public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
            int mark[] = new int[matrix.length];
            for(int i = 0;i < rows;i++){
                for(int j = 0;j < cols;j++){
                    if(helper(matrix,rows,cols,i,j,str,0,mark)){
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean helper(char[] matrix, int rows, int cols, int i, int j, char[] str, int strIndex, int[] mark){
            int index = i * cols + j;
            //运动范围在矩阵范围内，且当前点的值等于序列中对应的值，且该点未访问过
            if(i >= rows || i < 0 || j >= cols || j < 0 ||matrix[index] != str[strIndex] || mark[index] == 1){
                return false;
            }
            if(strIndex == str.length - 1){
                return true;
            }
            mark[index] = 1;
            if(helper(matrix,rows,cols,i+1,j,str,strIndex+1,mark)
                    ||helper(matrix,rows,cols,i,j+1,str,strIndex+1,mark)
                    ||helper(matrix,rows,cols,i-1,j,str,strIndex+1,mark)
                    ||helper(matrix,rows,cols,i,j-1,str,strIndex+1,mark)){
                return true;
            }
            mark[index] = 0;
            return false;
        }
    }

}
