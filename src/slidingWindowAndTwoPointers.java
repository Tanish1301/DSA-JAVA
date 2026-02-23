public class slidingWindowAndTwoPointers {

    public static int maxLength(int[] arr, int maxSum) {
        int l = 0;
        int r = 0;
        int sum = arr[0];
        int maxLen = 0;

        while (r < arr.length) {
            if (sum <= maxSum) {
                // update max length
                maxLen = Math.max(maxLen, r - l + 1);

                // expand window
                r++;
                if (r < arr.length) {
                    sum += arr[r];
                }
            } else {
                // shrink window
                sum -= arr[l];
                l++;
            }
        }

        return maxSum;
    }

    public static int maxConsecutiveOnes(int[] arr, int k){
        int l = 0;
        int zeroCounter = 0;
        int maxLent = 0;

        for (int r = 0; r < arr.length - 1; r++){
            if(arr[r] == 0){
                zeroCounter++;
            }
            while (zeroCounter > k){
                if (arr[l] == 0){
                    zeroCounter--;
                }
                l++;
            }

            maxLent = Math.max(maxLent, r-l+1 );

        }
        return maxLent;
    }

}
