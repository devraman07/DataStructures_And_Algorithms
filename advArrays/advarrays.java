public class advarrays {

    // Maximum sub Array Sum
    public static void MaxSubarraySum(int arr[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum = 0;
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                System.out.print(currSum + " ");
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();

        }
        System.out.println("The max sum is: " + maxSum);
    }

    // Max SubarryaSum Prefix approach

    public static void MaxSubarraySumPrefix(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The max sum is: " + maxSum);
    }

    public static void Kadens(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length ; i++) {
            cs = cs + arr[i];

            if(cs < 0) {
                cs = 0;
            }

            ms = Math.max(ms,cs);
        }
        System.out.println("Max sum is : " + ms);
    }

    //calculate trappedRainWater 
    public static int TrappedRainWater(int height[]) {
        int n = height.length;
        //calculating left max boundry
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        //calculating right max boundry
        int rightMax [] = new int[height.length];
        rightMax[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i --) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        for(int  i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            trappedWater += waterLevel - height[i];
        }
        return trappedWater;


        
    }

    public static int BuyAndSellStocks(int prices[]) {
        int n = prices.length;
        int BuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < n; i++) {
           if(BuyPrice < prices[i]) {
            int profit = prices[i] -BuyPrice;
             maxProfit = Math.max(maxProfit, profit);
           } else {
            BuyPrice = prices[i];
           }
        }

        return maxProfit;
    }

    public static boolean checkDuplicates(int arr[]) {
        int n = arr.length;
            for(int i = 0; i < n - 1; i++) {
                 for(int j = i + 1; j < n; j++) {
                    if(arr[i] == arr[j]) {
                     return true;
                    }
                 }
            }
            return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        // // MaxSubarraySum(arr);
        // // MaxSubarraySumPrefix(arr);
        // Kadens(arr);

        // int height [] = {
        //     2, 4, 0, 6, 1, 3, 7
        // };
        // System.out.println(TrappedRainWater(height));

    //     int prices[] = {
    //         7, 1, 5, 3, 6, 4
    //     };
    //    System.out.println( "Max profit is : " + BuyAndSellStocks(prices));
    System.out.println(checkDuplicates(arr));
    }
}