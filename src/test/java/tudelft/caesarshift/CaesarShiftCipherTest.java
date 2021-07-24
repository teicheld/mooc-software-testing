package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    @ParameterizedTest(name = "str={0}, shift={1}, result={2}")
            @CsvSource({
            "abc, 3, def", "abc, 26, abc", "abc, -26, abc", "a, 0, a", "z, -1, y"
    })
    public void test(String str, int shift, String expectedResult)
    {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher(str, shift);
        Assertions.assertEquals(expectedResult, result);
    }
}