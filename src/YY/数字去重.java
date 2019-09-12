package YY;

import javafx.collections.ArrayChangeListener;

import java.lang.reflect.Array;
import java.util.*;

public class Êý×ÖÈ¥ÖØ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String input = scanner.next();
            char[] chars = input.toCharArray();

//            TreeMap<Integer, ArrayList<Integer>> maps = new TreeMap<Integer, ArrayList<Integer>>();
//
//            for (int i = 0; i < nums.length; i++) {
//                int currentKey = nums[i] - '0';
//                if(!maps.containsKey(currentKey)){
//                    maps.put(currentKey, new ArrayList<Integer>());
//                }
//                maps.get(currentKey).add(i);
//            }
//
//            for (int i = 0; i < maps.size(); i++) {
//                System.out.print(maps.keySet().toArray()[i]);
//            }
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < chars.length; i++) {
                if(!set.contains(chars[i])){
                    set.add(chars[i]);
                }else{
                    chars[i] = '0';
                }
            }

            int min = Integer.MAX_VALUE;
            for (int i = 0; i < chars.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < chars.length; j++) {
                    if(chars[j] != '0'){
                        sb.append(chars[j]);
                    }
                }
                Integer num = Integer.parseInt(sb.toString());
                if(num > min){

                }else{
                    min = num;
                }
            }
            System.out.println(min);
        }


    }
}
