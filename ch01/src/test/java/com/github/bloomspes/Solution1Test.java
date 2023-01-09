package com.github.bloomspes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution1Test {

    @Test
    void printNumbers() {
        Solution1 app = new Solution1();

        assertThat(app.convertToBinary(1)).isEqualTo(Integer.toString(1, 2));
        assertThat(app.convertToOctal(1111)).isEqualTo(Integer.toString(1111, 8));
        assertThat(app.convertToHexaDecimal(123)).isEqualTo(Integer.toString(123, 16));

        assertThat(app.reciprocal(123)).isEqualTo(String.format("%a\n", 1.0 / 123));
    }
}
