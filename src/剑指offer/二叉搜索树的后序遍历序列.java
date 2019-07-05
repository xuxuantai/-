package ��ָoffer;

/**
 * Created by LaoP on 2019/7/5.
 */
public class �����������ĺ���������� {
    public class Solution {
        public boolean VerifySquenceOfBST(int [] sequence) {
            if(sequence == null || sequence.length == 0){
                return false;
            }
            return verify(sequence, 0, sequence.length - 1);
        }

        private boolean verify(int[] sequence, int first, int last){
            if(last - first <= 1){
                return true;
            }
            int middle = first;
            while (middle < last && sequence[middle] < sequence[last]){
                middle++;
            }
            //��ʱmiddle�����������������ֿ�
            for(int i = middle; i < last; i++){
                if(sequence[i] < sequence[last]){
                    return false;
                }
            }
            return verify(sequence, first, middle - 1) && verify(sequence, middle, last - 1);
        }
    }

}
