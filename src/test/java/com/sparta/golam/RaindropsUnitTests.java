package com.sparta.golam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RaindropsUnitTests {

    @Nested
    @DisplayName("Testing inputs Three, Five and Seven")
    class testingInputsThreeFiveAndSeven {

        @Test
        @DisplayName("inputting 3 returns Pling")
        void inputting3ReturnsPling() {
            Assertions.assertEquals("Pling", raindrops(3));
        }

        @Test
        @DisplayName("inputting 5 returns Plang")
        void inputting5ReturnsPlang() {
            Assertions.assertEquals("Plang", raindrops(5));
        }

        @Test
        @DisplayName("inputting 7 returns Plong")
        void inputting7ReturnsPlong() {
            Assertions.assertEquals("Plong", raindrops(7));
        }

        @Test
        @DisplayName("inputting negative 3 returns Pling")
        void inputtingNegative3ReturnsPling() {
            Assertions.assertEquals("Pling", raindrops(-3));
        }

        @Test
        @DisplayName("inputting negative 5 returns Plang")
        void inputtingNegative5ReturnsPlang() {
            Assertions.assertEquals("Plang", raindrops(-5));
        }

        @Test
        @DisplayName("inputting negative 7 returns Plong")
        void inputtingNegative7ReturnsPlong() {
            Assertions.assertEquals("Plong", raindrops(-7));
        }
    }

    @Nested
    @DisplayName("Testing positive integers")
    class testingPositiveIntegers {
        @Test
        @DisplayName("inputting 15 returns PlingPlang")
        void inputting15ReturnsPlingPlang() {
            Assertions.assertEquals("PlingPlang", raindrops(15));
        }

        @Test
        @DisplayName("inputting 21 returns PlingPlong")
        void inputting21ReturnsPlingPlong() {
            Assertions.assertEquals("PlingPlong", raindrops(21));
        }

        @Test
        @DisplayName("inputting 35 returns PlangPlong")
        void inputting35ReturnsPlangPlong() {
            Assertions.assertEquals("PlangPlong", raindrops(35));
        }

        @Test
        @DisplayName("inputting 105 returns PlingPlangPlong")
        void inputting105ReturnsPlingPlangPlong() {
            Assertions.assertEquals("PlingPlangPlong", raindrops(105));
        }

        @Test
        @DisplayName("inputting 9 returns Pling")
        void inputting9ReturnsPling() {
            Assertions.assertEquals("Pling", raindrops(9));
        }

        @Test
        @DisplayName("inputting 20 returns Plang")
        void inputting20ReturnsPlang() {
            Assertions.assertEquals("Plang", raindrops(20));
        }

        @Test
        @DisplayName("inputting 28 returns Plong")
        void inputting28ReturnsPlong() {
            Assertions.assertEquals("Plong", raindrops(28));
        }
    }

    @Nested
    @DisplayName("Testing zero and negative integers")
    class testingZeroAndNegativeIntegers {

        @Test
        @DisplayName("inputting 0 returns 0")
        void inputting0Returns0() {
            Assertions.assertEquals("0", raindrops(0));
        }

        @Test
        @DisplayName("inputting negative 27 returns Pling")
        void inputtingNegative27ReturnsPling() {
            Assertions.assertEquals("Pling", raindrops(-27));
        }

        @Test
        @DisplayName("inputting negative 55 returns Plang")
        void inputtingNegative55ReturnsPlang() {
            Assertions.assertEquals("Plang", raindrops(-55));
        }

        @Test
        @DisplayName("inputting negative 77 returns Plong")
        void inputtingNegative77ReturnsPlong() {
            Assertions.assertEquals("Plong", raindrops(-77));
        }

        @Test
        @DisplayName("inputting negative 75 returns PlingPlang")
        void inputtingNegative75ReturnsPlingPlang() {
            Assertions.assertEquals("PlingPlang", raindrops(-75));
        }

        @Test
        @DisplayName("inputting negative 63 returns PlingPlong")
        void inputtingNegative63ReturnsPlingPlong() {
            Assertions.assertEquals("PlingPlong", raindrops(-63));
        }

        @Test
        @DisplayName("inputting negative 70 returns PlangPlong")
        void inputtingNegative70ReturnsPlangPlong() {
            Assertions.assertEquals("PlangPlong", raindrops(-70));
        }

        @Test
        @DisplayName("inputting negative 210 returns PlingPlangPlong")
        void inputtingNegative210ReturnsPlingPlangPlong() {
            Assertions.assertEquals("PlingPlangPlong", raindrops(-210));
        }
    }

}
