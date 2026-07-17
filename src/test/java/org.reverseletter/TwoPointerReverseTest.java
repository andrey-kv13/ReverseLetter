package org.reverseletter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TwoPointerReverseTest {

    @ParameterizedTest
    @CsvSource( {
            "a, a",
            "J@va the be$t!123, t@eb eht av$J!123",
            "'', ''",
            "123 !@#, 123 !@#",
            "abcd, dcba"
    })

    public void keepsNonLettersInPlace(String input, String result) {
        assertEquals(result, TwoPointerReverse.reverse(input));
    }

    @Test
    void nullInputException() {
        assertThrows(NullPointerException.class, () ->
                TwoPointerReverse.reverse(null)
        );
    }
}

