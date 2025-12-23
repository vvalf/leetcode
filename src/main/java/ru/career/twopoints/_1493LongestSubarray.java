package ru.career.twopoints;

/*
Given a binary array nums, you should delete one element from it.
Return the size of the longest non-empty subarray containing only 1's in the resulting array.
Return 0 if there is no such subarray.
        input                       | expResult
        [1, 1, 0, 1]                | 3
        [1, 1, 0, 1, 0, 1, 1, 0, 1] | 3
        [0, 1, 1, 1, 0, 1, 1, 0, 1] | 5
*/
public class _1493LongestSubarray {

//    двигаем левый пока ноли больше единицы
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeros = 0;
        int max = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeros++;

            while (zeros > 1) {
                if (nums[left] == 0) zeros--;
                left++;
            }

            max = Math.max(max, right - left);
        }

        return max;
    }

//    Еще можно решить через Dynamic Programming



//    Запутался я тут пипец
    public int longestSubarrayMy(int[] nums) {
        var result = 0;

        var vasted = false;
        var l = 0;
        var r = 0;
        int currentRes = 0;
        int firstIndexOfZero = 0;
        while (r < nums.length) {
            System.out.printf("v: %b r: %d, l: %d, right: %d, left: %d%n", vasted, r, l, nums[r], nums[l]);
            if (!vasted) {
                if (nums[r] == 0) {
                    vasted = true;
                    firstIndexOfZero = r;
                    r++;
                } else {
                    currentRes++;
                    result = Math.max(result, currentRes);
                    r++;
                }
            } else if (vasted) {
                if (nums[r] == 1) {
                    r++;
                    currentRes++;
                    result = Math.max(result, currentRes);
                } else if (nums[r] == 0) {
                    var shift = firstIndexOfZero - l + 1;
                    l = firstIndexOfZero + 1;
                    firstIndexOfZero = r;
                    r = r + 1;
                    currentRes = currentRes - shift;
                }
            }
        }
        return result;
    }


// тут собирают массив единиц идущих подряд
// и потом ищут самую большую пару

//    public int longestSubarrayDP(int[] nums) {
//        const dp = []
//        let count = 0;
//
//        for (let i = 0; i < nums.length; i++) {
//            if (nums[i]) {
//                count++;
//            } else {
//                dp.push(count);
//                count = 0;
//            }
//        }
//        dp.push(count);
//        let max = 0;
//        if (dp.length == = 1) return dp[0] - 1;
//
//        for (let i = 0; i < dp.length - 1; i++) {
//            max = Math.max(max, dp[i] + dp[i + 1])
//        }
//
//        return max;
//    }
}