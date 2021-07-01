import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void babadWorks() {
        assertThat(Main.longestPalindrome("babad")).isEqualTo("bab");
    }

    @Test
    void singleCharWorks() {
        assertThat(Main.longestPalindrome("b")).isEqualTo("b");
    }
    @Test
    void length2Works() {
        assertThat(Main.longestPalindrome("aa")).isEqualTo("aa");
    }

    @Test
    void longerStringWorks() {
        assertThat(Main.longestPalindrome("qwertyuioppoiuytrewq")).isEqualTo("qwertyuioppoiuytrewq");
    }
    @Test
    void longerOddLengthStringWorks() {
        assertThat(Main.longestPalindrome("qwertyuiop1poiuytrewq")).isEqualTo("qwertyuiop1poiuytrewq");
    }


}