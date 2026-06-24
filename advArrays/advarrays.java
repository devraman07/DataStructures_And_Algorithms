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

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        // MaxSubarraySum(arr);
        MaxSubarraySumPrefix(arr);
    }
}