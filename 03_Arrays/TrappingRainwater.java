public class TrappingRainwater {

    // Method to calculate the total trapped rainwater
    public static int trappedRainWater(int height[]) {
        int n = height.length;

        // Arrays to store the maximum height boundaries on the left and right
        int leftMaxBound[] = new int[n];
        int rightMaxBound[] = new int[n];

        // Fill the leftMaxBound array with maximum heights to the left of each index
        leftMaxBound[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMaxBound[i] = Math.max(leftMaxBound[i - 1], height[i]);
        }

        // Fill the rightMaxBound array with maximum heights to the right of each index
        rightMaxBound[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) { 
            rightMaxBound[i] = Math.max(rightMaxBound[i + 1], height[i]);
        }

        // Calculate the total trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // Water level is determined by the minimum of left and right bounds
            int waterLevel = Math.min(leftMaxBound[i], rightMaxBound[i]);

            // Trapped water is the difference between water level and height
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String args[]) {
        // Initialize the height array (elevation map)
        int height[] = {2, 4, 6, 7, 11, 5, 1, 2, 8};

        // Calculate and print the total trapped rainwater
        int waterLevel = trappedRainWater(height);
        System.out.println("Total trapped rainwater: " + waterLevel);
    }
}
