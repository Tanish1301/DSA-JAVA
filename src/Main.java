//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        int maxSum = 15;
        int[] arr2 = {1,0,1,0,0,0,1};

        System.out.println("Maximum subarray length with sum as maxSum = " + slidingWindowAndTwoPointers.maxLength(arr, maxSum));
        System.out.println("Maximum consecutive ones = "  + slidingWindowAndTwoPointers.maxConsecutiveOnes(arr2, 2));


        String str = "dedehaa";
        System.out.println("Length of longest substring with K chars is " + slidingWindowAndTwoPointers.lengthOfLongestSubstringKDistinct(str, 2));

        String str2 = "cadbzabcd";
        System.out.println("Length of longest substring without repeating chars is " + slidingWindowAndTwoPointers.longestSubstringWithoutRepeatingChars(str2));

    }


}