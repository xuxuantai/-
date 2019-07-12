package ��ָoffer;

import java.util.HashMap;

/**
 * Created by LaoP on 2019/7/11.
 */
public class ��һ��ֻ����һ�ε��� {
//    public int FirstNotRepeatingChar(String str) {
//        if(str.length() == 0){
//            return -1;
//        }
//        int[] cnt = new int[256];
//        for (int i = 0; i < str.length(); i++) {
//            cnt[str.charAt(i)]++;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if(cnt[str.charAt(i)] == 1){
//                return i;
//            }
//        }
//        return 0;
//    }

    /**
     * ʹ��HashMap�洢ÿ�����ĳ��ִ���
     * @param str
     * @return
     */
    public int FirstNotRepeatingChar(String str) {
        if(str.length() == 0){
            return -1;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }else {
                map.put(str.charAt(i), 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return 0;
    }
}
