package ru.career;

/*
 * */

//[-4, -1, 0, 3, 10] | [0, 1, 9, 16, 100]
public class _977SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        var result = new int[nums.length];

//        var res = new LinkedList<Integer>();


        var l = 0;
        var r = nums.length - 1;
        var position = nums.length - 1;
        while (true) {
            var left = nums[l] * nums[l];
            var right = nums[r] * nums[r];
            if (left > right) {
                result[position] = left;
                position--;
//                res.addFirst(left);
                if (l == r) break;
                l++;
            } else {
                result[position] = right;
                position--;
//                res.addFirst(right);
                if (l == r) break;
                r--;
            }
        }
        return result;
    }

}