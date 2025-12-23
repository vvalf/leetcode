package ru.career.twopoints;

/*
Given an array of characters chars, compress it using the following algorithm:
Begin with an empty string s. For each group of consecutive repeating characters in chars:
    If the group's length is 1, append the character to s.
    Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
After you are done modifying the input array, return the new length of the array.
You must write an algorithm that uses only constant extra space.
        ["a", "a", "b", "b", "c", "c", "c"]                               | 6 | a2b2c3
        ["a", "b", "c"]                                                   | 3 | abc
        ["a", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b"] | 4 | ab12
*/
public class _443StringCompression {

    public int compress(char[] chars) {
        char currentChar = 0;
        int count = 0;
        int writeIndex = 0;

        for (char c : chars) {
            if (c != currentChar) {
                if (count > 1) {
                    for (char cc : Integer.toString(count).toCharArray()) {
                        chars[writeIndex++] = cc;
                    }
                }
                chars[writeIndex++] = c;
                currentChar = c;
                count = 1;
            } else {
                count++;
            }
        }
        if (count > 1) {
            for (char cc : Integer.toString(count).toCharArray()) {
                chars[writeIndex++] = cc;
            }
        }

        return writeIndex;
    }
}