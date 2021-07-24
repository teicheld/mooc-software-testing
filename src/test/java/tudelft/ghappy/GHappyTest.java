package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest(name = "str={0}, result={1}")
    @CsvSource({
            "'ssgss', false",
            "'ssggss', true",
            "'ssggssgss', false",
            "'ssggssggss', true"
    })
    public void isHappyTest(String str, boolean expectedResult)
    {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }
}
