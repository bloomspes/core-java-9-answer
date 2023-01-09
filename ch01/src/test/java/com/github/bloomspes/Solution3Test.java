package com.github.bloomspes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class Solution3Test {
    @Test
    void maximum() {
        Solution3 app = new Solution3();

        assertThatThrownBy(() -> {
            app.maximum(new int[]{});
        }).isInstanceOf(RuntimeException.class);

        assertThat(app.maximum(new int[]{1})).isEqualTo(1);
        assertThat(app.maximum(new int[]{1, 2})).isEqualTo(2);
        assertThat(app.maximum(new int[]{1, 2, 3})).isEqualTo(3);
        assertThat(app.maximum(new int[]{1, 2, 3, 4})).isEqualTo(4);
        assertThat(app.maximum(new int[]{1, 2, 3, 5, 4})).isEqualTo(5);
    }

    @Test
    void maximum3() {
        Solution3 app = new Solution3();

        assertThat(app.maximum3(new int[]{1, 2, 3})).isEqualTo(3);
        assertThat(app.maximum3(new int[]{1, 3, 2})).isEqualTo(3);
        assertThat(app.maximum3(new int[]{3, 2, 1})).isEqualTo(3);
        assertThat(app.maximum3(new int[]{3, 1, 2})).isEqualTo(3);
    }
}
