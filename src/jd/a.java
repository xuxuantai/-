package jd;

import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();//����������Ů������
            int m = scanner.nextInt();//��ϵ��

            ArrayList<ArrayList<Integer>> friendList = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < m; i++) {
                ArrayList<Integer> friend = new ArrayList<Integer>();
                friend.add(scanner.nextInt());
                friend.add(scanner.nextInt());
                friendList.add(friend);
            }

            //�洢ÿ�����ж��ٸ���ϵ
            int[] friendMap = new int[2*n + 1];
            Arrays.fill(friendMap,0);
            for (int i = 0; i < m; i++) {
                friendMap[friendList.get(i).get(0)]++;
                friendMap[friendList.get(i).get(1)]++;
            }

            int outerNum = 0;
            ArrayList<Integer> outers = new ArrayList<Integer>();
            while(friendList.size() > 0){
                int bigFriendIndex = 0;
                //�ҵ���ϵ�����˵ı��
                for (int i = 1; i < 2*n + 1; i++) {
                    if(bigFriendIndex < friendMap[i]){
                        bigFriendIndex = i;
                    }
                }
                //�������˵Ĺ�ϵ���Ƴ����ң�ֱ��������û�й�ϵ
                for (int i = 0; i < friendList.size(); i++) {
                    if(friendList.get(i).contains(bigFriendIndex)){
                        friendList.remove(i);
                    }
                }

                if(!outers.contains(bigFriendIndex)){
                    outers.add(bigFriendIndex);
                }
                outerNum++;
            }

            System.out.println(outerNum);
            for (int i = 0; i < outers.size(); i++) {
                System.out.println(outers.get(i) + " ");
            }


        }
    }
}
