package ��ָoffer;

/**
 * Created by LaoP on 2019/6/30.
 */
public class �����е�·�� {
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
            //�˶���Χ�ھ���Χ�ڣ��ҵ�ǰ���ֵ���������ж�Ӧ��ֵ���Ҹõ�δ���ʹ�
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
