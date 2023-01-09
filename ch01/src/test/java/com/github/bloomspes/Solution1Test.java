package com.github.bloomspes;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution1Test {

    private ByteArrayOutputStream byteArrayOutputStream;

    private final String words = "Binary: 11110000011110011\n" +
                    "Octal: 360363\n" +
                    "Hexadecimal: 1e0f3\n" +
                    "Hexadecimal floating point: 0x1.10871978f8ap-17\n";

    @BeforeEach
    void setUp() {
        ByteArrayInputStream byteArrayInputStream =
                new ByteArrayInputStream("123123".getBytes());

        this.byteArrayOutputStream = new ByteArrayOutputStream(
                this.words.length() * 2
        );

        System.setIn(byteArrayInputStream);

        System.setOut(new PrintStream(this.byteArrayOutputStream));
    }

    @Test
    void solution2() {
        Solution1.main(null);

        assertThat(this.words).isEqualTo(this.byteArrayOutputStream.toString());
    }
}
