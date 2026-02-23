import java.util.HashMap;
import java.util.Map;

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

    public static int lengthOfLongestSubstringKDistinct(String str, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int left = 0;
        int maxLen = 0;


        for (int right = 0; right < str.length(); right++){
            freq.put(str.charAt(right), freq.getOrDefault(str.charAt(right), 0)+ 1);
            while (freq.size() > k){
                char c = str.charAt(left);
                freq.put(c, freq.get(c)-1);
                if (freq.get(c) == 0){
                    freq.remove(c);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }


    public static int longestSubstringWithoutRepeatingChars(String str){
        Map<Character, Integer> freq = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < str.length(); right++){
            char c = str.charAt(right);
            freq.put(c, freq.getOrDefault(c,0)+1);
            while (freq.get(c) > 1){
                char l = str.charAt(left);
                freq.put(l, freq.get(l)-1);
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
