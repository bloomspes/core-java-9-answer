package com.github.bloomspes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class Solution6Test {

    @Test
    void factorial() {
        Solution6 app = new Solution6();

        assertThat(app.factorial(0)).isEqualTo(0);
        assertThat(app.factorial(1)).isEqualTo(1);
        assertThat(app.factorial(2)).isEqualTo(2);
        assertThat(app.factorial(3)).isEqualTo(6);
        assertThat(app.factorial(5)).isEqualTo(120);

        assertThatThrownBy(() -> {
            app.factorial(Integer.MIN_VALUE + 1);
        }).isInstanceOf(RuntimeException.class);

    }

    @DisplayName("When number is 1000 or greater enough")
    @Test
    void integerOverflow() {
        Solution6 app = new Solution6();

        assertThat(app.factorial(1000)).isNotZero();
        assertThat(app.factorial(1000)).isNotNull();
        assertThat(app.factorial(1000)).isNotNegative();
    }

}
