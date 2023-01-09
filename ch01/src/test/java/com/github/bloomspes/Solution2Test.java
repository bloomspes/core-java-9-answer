package com.github.bloomspes;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution2Test {

    private final String words = "-10\n" + "Math.floorMod(angle, 360) is 350\n";

    private ByteArrayOutputStream byteArrayOutputStream;


    @BeforeEach
    void setUp() {
        ByteArrayInputStream byteArrayInputStream =
                new ByteArrayInputStream("-10".getBytes());

        this.byteArrayOutputStream = new ByteArrayOutputStream(
                this.words.length() * 2
        );

        System.setIn(byteArrayInputStream);

        System.setOut(new PrintStream(this.byteArrayOutputStream));
    }


    @Test
    void solution2() {
        Solution2.main(null);

        assertThat(this.words).isEqualTo(this.byteArrayOutputStream.toString());
    }
}
