package ��ָoffer;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by LaoP on 2019/7/8.
 */
public class �����г��ִ�������һ������� {

    public class Solution {
        public int MoreThanHalfNum_Solution(int [] array) {
            Arrays.sort(array);

            int cnt = 0;
            for(int num : array){
                if(num == array[array.length/2])
                    cnt++;
            }

            if(cnt > array.length/2){
                return array[array.length/2];
            }else {
                return 0;
            }

        }
    }
}
