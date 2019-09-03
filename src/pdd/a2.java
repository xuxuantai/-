package pdd;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.next();
            String[] strs = str.split(";");
            String str1 = strs[0];
            String str2 = strs[1];

            int n = Integer.parseInt(str2);
            String[] strNums = str1.split(",");
            int[] nums = new int[strNums.length];

            /**----------数据初始化完成-----------**/

            ArrayList<Integer> list1 = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();
            for (int i = 0; i < nums.length; i++) {
                int num = Integer.parseInt(strNums[i]);
                if(num % 2 == 0){
                    list1.add(num);
                }
                if(num % 2 == 1){
                    list2.add(num);
                }
            }

            Integer[] nums1 = list1.toArray(new Integer[list1.size()]);
            Integer[] nums2 = list2.toArray(new Integer[list2.size()]);

            Arrays.sort(nums1);
            Arrays.sort(nums2);


            StringBuilder sb = new StringBuilder();
            for (int i = nums1.length - 1; i >= 0 && n > 0 ; i--) {
//                if(n == 1){
//                    sb.append(nums1[i]);
//                    break;
//                }
                sb.append(nums1[i] + ",");
                n--;
            }
            for (int i = nums2.length - 1; i >= 0 && n > 0 ; i--) {
//                if(n == 1){
//                    sb.append(nums2[i]);
//                    break;
//                }
                sb.append(nums2[i] + ",");
                n--;
            }
            String result = sb.toString();
            System.out.println(result.substring(0, result.length() - 1));


        }


    }

}
