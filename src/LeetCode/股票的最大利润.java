package LeetCode;

public class 股票的最大利润 {
    /**
     * 定义一个最小值和最大差，每次更新最小值和最大差
     * 切莫要定义最大值去计算差值比较，因为买入卖出遵循先低后高
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
