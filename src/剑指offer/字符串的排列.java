package ½£Ö¸offer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by LaoP on 2019/7/3.
 */
public class ×Ö·û´®µÄÅÅÁÐ {
    public class Solution {
        public ArrayList<String> Permutation(String str) {
            ArrayList<String> resultList = new ArrayList<>();
            if(str.length() == 0){
                return resultList;
            }
            //µÝ¹éº¯Êý
            dfs(str.toCharArray(), resultList,0);
            Collections.sort(resultList);
            return resultList;
        }

        private void dfs(char[] chars, ArrayList<String> resultlist,int index){
            if(chars.length - 1 == index){
                if(!resultlist.contains(new String(chars))){
                    resultlist.add(new String(chars));
                    return;
                }
            }
            for(int i = index; i < chars.length; i++){
                swap(chars, index,i);
                dfs(chars, resultlist, index + 1);
                swap(chars, index, i);
            }
        }

        private void swap(char[] chars, int i , int j){
            char temp = chars[j];
            chars[j] = chars[i];
            chars[i] = temp;
        }

    }
}
