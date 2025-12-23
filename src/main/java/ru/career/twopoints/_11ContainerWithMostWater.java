package ru.career.twopoints;

/*
 * Решение:
 * Окно снаружи внутрь. Сужается та часть, которая меньше
 *
 * Оказывается: Максимальный периметр не равен максимальной площади.
 * Например, периметр 1 + 3 = 4 с площадью 3,
 * а квадрат 2х2 даёт такой же периметр = 4, а площадь больше = 4
 * _______
 *
 * Еще в решениях посмотрел оптимизацию, что сдвигают окно не на одну единицу,
 * а в цикле, пока высота следующего столбца не будет выше уже проверенного
 * т.е. в примере [1, 8, 6, 2, 5, 4, 9, 3, 7] моя l сдвинется
 * не 1→8→6, а 1→8 и сразу на 9 (минуя 6, 2, 5 и 4)
 * */

public class _11ContainerWithMostWater {
    public int maxArea(int[] height) {
        var result = 0;

        var l = 0;
        var r = height.length - 1;

        while (true) {
            var left = height[l];
            var right = height[r];
            var curValue = Math.min(left, right) * (r - l);
            if (curValue > result) result = curValue;
            if (left > right) {
                r--;
            } else {
                l++;
            }
            if (l == r) break;
        }


        return result;
    }
}


//public int maxArea(int[] height) {
//    var result = 0;
//    var maxHeight = 0;
//    for (int i = 0; i < height.length - 1; i++) {
//        if (height[i] <= maxHeight) continue;
//        for (int j = i + 1; j < height.length; j++) {
//            var curValue = Math.min(height[i], height[j]) * (j - i);
//            if (curValue > result) result = curValue;
//        }
//    }
//    return result;
//}
