package ru.career

import ru.career.twopoints._1493LongestSubarray
import ru.career.twopoints._443StringCompression
import spock.lang.Specification
import spock.lang.Unroll

class _443StringCompressionSpec extends Specification {
    var testService = new _443StringCompression()

    @Unroll
    def 'input: #input result: #expResult'() {
        when:
        def actResult = testService.compress(input as char[])

        then:
        noExceptionThrown()
        actResult == expResult

        where:
        input                                                             | expResult
        ['a', 'a', 'b', 'b', 'c', 'c', 'c']                               | 6
        ['a', 'b', 'c']                                                   | 3
        ['a']                                                             | 1
        ['a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'] | 4
    }
}