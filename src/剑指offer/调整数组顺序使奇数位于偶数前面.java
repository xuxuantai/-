package ��ָoffer;

public class ��������˳��ʹ����λ��ż��ǰ�� {

    public class Solution {
        public void reOrderArray(int [] array) {
            //�����ĸ���
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
