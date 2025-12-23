package ru.career.twopoints;

/*
Given an integer array nums sorted in increasing order,
return an array of the squares of each number sorted in increasing order.

Решение:
Окно снаружи внутрь.
Складываем большую границу в результат и двигаем эту сторону


*/
//[-4, -1, 0, 3, 10] | [0, 1, 9, 16, 100]
public class _977SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        var result = new int[nums.length];

        var l = 0;
        var r = nums.length - 1;
        var position = nums.length - 1;
        while (true) {
            var left = nums[l] * nums[l];
            var right = nums[r] * nums[r];
            if (left > right) {
                result[position] = left;
                position--;
                if (l == r) break;
                l++;
            } else {
                result[position] = right;
                position--;
                if (l == r) break;
                r--;
            }
        }
        return result;
    }

}