package LeetCode;

import java.util.ArrayList;
import java.util.Scanner;

public class �Ӽ�������_���� {

    ArrayList<Integer> list = new ArrayList<>();

    private void backtrack(int step, ArrayList<Integer> originList, int key){

        while (step < originList.size()){
            //���Ԫ��
            list.add(originList.get(step));
            if(getsum(list) == key){
                //�����������
                System.out.println(list);
            }
            backtrack(step + 1, originList, key);
            //�Ƴ�Ԫ�أ�������
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
