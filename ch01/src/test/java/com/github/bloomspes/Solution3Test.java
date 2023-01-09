package com.github.bloomspes;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution3Test {

    private final String words = "Maximum number with ?: 9\n" +
            "Maximum number with Math.max: 9\n";

    private ByteArrayOutputStream byteArrayOutputStream;

    @BeforeEach
    void setUp() {
        ByteArrayInputStream byteArrayInputStream =
                new ByteArrayInputStream("7 8 9".getBytes());

        this.byteArrayOutputStream = new ByteArrayOutputStream(
                this.words.length() * 2
        );

        System.setIn(byteArrayInputStream);

        System.setOut(new PrintStream(this.byteArrayOutputStream));
    }

    @Test
    void solution3() {
        Solution3.main(null);

        assertThat(this.words).isEqualTo(this.byteArrayOutputStream.toString());
    }
}
