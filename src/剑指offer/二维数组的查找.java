package ���ݽṹ�㷨;

/**
 * Created by LaoP on 2019/3/5.
 */

public class ��ά����Ĳ��� {
    /**
     * ��Ŀ����
     ����һ����ά���飬��ÿһ�д����ҵ������򣬴��ϵ���Ҳ�ǵ������򡣸���һ�������ж�������Ƿ��ڸö�ά�����С�
     *����˼·
     Ҫ��ʱ�临�Ӷ� O(M + N)���ռ临�Ӷ� O(1)��
     �ö�ά�����е�һ����������ߵ���������С���±ߵ�����������
     ��ˣ������Ͻǿ�ʼ���ң��Ϳ��Ը��� target �͵�ǰԪ�صĴ�С��ϵ����С�������䣬��ǰԪ�صĲ�������Ϊ���½ǵ�����Ԫ�ء�
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
