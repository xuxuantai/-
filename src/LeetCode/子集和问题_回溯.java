package LeetCode;

import java.util.ArrayList;
import java.util.Scanner;

public class 子集和问题_回溯 {

    ArrayList<Integer> list = new ArrayList<>();

    private void backtrack(int step, ArrayList<Integer> originList, int key){

        while (step < originList.size()){
            //添加元素
            list.add(originList.get(step));
            if(getsum(list) == key){
                //满足条件输出
                System.out.println(list);
            }
            backtrack(step + 1, originList, key);
            //移出元素，即回溯
            originList.remove(originList.size() - 1);
        }

    }

    private int getsum(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

}
