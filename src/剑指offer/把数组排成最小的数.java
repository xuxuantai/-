package ��ָoffer;

/**
 * Created by LaoP on 2019/7/8.
 */
public class �������ų���С���� {
    public class Solution {
        public String PrintMinNumber(int [] numbers) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    int a = Integer.valueOf("" + numbers[i] + numbers[j]);
                    int b = Integer.valueOf("" + numbers[j] + numbers[i]);
                    if(a > b){
                        int temp = numbers[j];
                        numbers[j] = numbers[i];
                        numbers[i] = temp;
                    }
                }
            }

            for (int i = 0; i < numbers.length; i++) {
                result.append(numbers[i]);
            }
            return result.toString();

        }
    }

}
