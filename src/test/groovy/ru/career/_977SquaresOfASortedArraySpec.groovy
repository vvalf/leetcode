package ru.career

import ru.career.twopoints._977SquaresOfASortedArray
import spock.lang.Specification
import spock.lang.Unroll

/*
Given an integer array nums sorted in non-decreasing order,
return an array of the squares of each number sorted in non-decreasing order.
*/

class _977SquaresOfASortedArraySpec extends Specification {
    var testService = new _977SquaresOfASortedArray()

    @Unroll
    def "input: #input result: #expResult"() {
        when:
        def actResult = testService.sortedSquares(input as int[])

        then:
        noExceptionThrown()
        actResult == expResult as int[]

        where:
        input              | expResult
        [-4, -1, 0, 3, 10] | [0, 1, 9, 16, 100]
        [-7, -3, 2, 3, 11] | [4, 9, 9, 49, 121]
        [-7, -3, 3, 11]    | [9, 9, 49, 121]

    }
}