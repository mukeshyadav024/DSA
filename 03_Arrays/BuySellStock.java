public class BuySellStock {

    // Method to calculate the maximum profit from buying and selling a stock
    public static int buySell(int price[]) {
        int n = price.length;

        // Variable to track the lowest buying price
        int buyPrice = Integer.MAX_VALUE;

        // Variable to store the maximum profit
        int maxProfit = 0;

        // Loop through the array to calculate the profit
        for (int i = 0; i < n; i++) {

            // Check if the current price is higher than the buying price
            if (buyPrice < price[i]) {
                // Calculate profit for the current price
                int profit = price[i] - buyPrice;

                // Update maxProfit if the current profit is greater
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // Update the buyPrice to the current price if it's lower
                buyPrice = price[i];
            }
        }

        // Return the maximum profit calculated
        return maxProfit;
    }

    public static void main(String args[]) {
        // Initialize the array with stock prices
        int price[] = {2, 4, 6, 7, 11, 5, 1, 2, 8};

        // Calculate and print the maximum profit
        int maxProfit = buySell(price);
        System.out.println("Maximum profit: " + maxProfit);
    }
}
