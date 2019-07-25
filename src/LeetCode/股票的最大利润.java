package LeetCode;

public class ��Ʊ��������� {
    /**
     * ����һ����Сֵ�����ÿ�θ�����Сֵ������
     * ��ĪҪ�������ֵȥ�����ֵ�Ƚϣ���Ϊ����������ѭ�ȵͺ��
     */
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            maxProfit = Math.max(prices[i] - min, maxProfit);
        }
        return maxProfit;
    }


}
