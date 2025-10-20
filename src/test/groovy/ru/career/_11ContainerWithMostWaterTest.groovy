package ru.career

import spock.lang.*

class _11ContainerWithMostWaterTest extends Specification {
    var testService = new _11ContainerWithMostWater()

    @Unroll
    def "input: #input result: #expResult"() {
        when:
        int actResult = testService.maxArea(input as int[])

        then:
        noExceptionThrown()
        actResult == expResult

        where:
        input                       | expResult
        [1, 8, 6, 2, 5, 4, 8, 3, 7] | 49
        [1, 1]                      | 1
        [1, 2, 4, 3]                | 4

    }
}