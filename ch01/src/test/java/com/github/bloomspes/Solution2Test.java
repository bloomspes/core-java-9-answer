package com.github.bloomspes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class Solution2Test {

    @Test
    void normalization() {
        Solution2 app = new Solution2();

        assertThatThrownBy(() -> {
            app.normalization(null);
        })
                .isInstanceOf(RuntimeException.class);

        assertThat(app.normalization(-10)).isEqualTo(Math.floorMod(-10, 360));
        assertThat(app.normalization(10)).isEqualTo(Math.floorMod(10, 360));
        assertThat(app.normalization(0)).isEqualTo(Math.floorMod(0, 360));
    }
}
