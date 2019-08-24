package jd;

import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();//男生人数，女生人数
            int m = scanner.nextInt();//关系数

            ArrayList<ArrayList<Integer>> friendList = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < m; i++) {
                ArrayList<Integer> friend = new ArrayList<Integer>();
                friend.add(scanner.nextInt());
                friend.add(scanner.nextInt());
                friendList.add(friend);
            }

            //存储每个人有多少个关系
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
                //找到关系最多的人的编号
                for (int i = 1; i < 2*n + 1; i++) {
                    if(bigFriendIndex < friendMap[i]){
                        bigFriendIndex = i;
                    }
                }
                //将最多的人的关系都移出教室，直到教室里没有关系
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
