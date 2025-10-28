package ru.career

import ru.career.twopoints._1493LongestSubarray
import spock.lang.Specification
import spock.lang.Unroll

/*
Given a binary array nums, you should delete one element from it.
Return the size of the longest non-empty subarray containing only 1's in the resulting array.
Return 0 if there is no such subarray.*/

class _1493LongestSubarraySpec extends Specification {
    var testService = new _1493LongestSubarray()

    @Unroll
    def "input: #input result: #expResult"() {
        when:
        def actResult = testService.longestSubarray(input as int[])

        then:
        noExceptionThrown()
        actResult == expResult

        where:
        input                       | expResult
        [1, 1, 0, 1]                | 3
        [1, 1, 0, 1, 0, 1, 1, 0, 1] | 3
        [0, 1, 1, 1, 0, 1, 1, 0, 1] | 5
        [0, 1, 1, 1, 0, 0, 1, 0, 0] | 3
        [0, 0, 1, 1, 0, 0, 1, 0, 0] | 2
        [1, 1, 1]                   | 2
        [1]                         | 0
        [0, 0, 0]                   | 0
        [0]                         | 0
    }
}