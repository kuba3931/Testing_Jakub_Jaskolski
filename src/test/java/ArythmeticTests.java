import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class ArythmeticTests {

    @Test
    void ThisMiddleTestShouldReturnEmpty() {

        int[] number_to_middle = {1,4,6,7,8};

        assertThat(ArythemicPrograming.GetMiddleNumbers(number_to_middle)).
                isEqualTo(new Object[] {});
    }

    @Test
    void ThisMiddleTestShouldReturnMiddleNumbers() {

        int[] number_to_middle = {1,4,6,8};

        assertThat(ArythemicPrograming.GetMiddleNumbers(number_to_middle)).
                isEqualTo(new Object[] {4, 6});

    }

    @ParameterizedTest
    @ValueSource(ints = {2,4,68,234724})
    void IsEvenWithEvenNumbersTest(int ints){
        Assertions.assertTrue(ArythemicPrograming.IsEven(ints));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,69,2343})
    void IsEvenWithOddNumbersTest(int ints){
        Assertions.assertFalse(ArythemicPrograming.IsEven(ints));
    }
    
    @Test
    void HowManyDividersSingleTest(){

        int a = 48;
        assertThat(ArythemicPrograming.HowManyDividers(a)).isEqualTo(10);

    }

    @ParameterizedTest
    @MethodSource("StreamForDividerTest")
    void HowManyDividersStreamTest(int input, int result){
        assertThat(ArythemicPrograming.HowManyDividers(input)).isEqualTo(result);
    }

    private static Stream<Arguments> StreamForDividerTest(){
        return Stream.of(
                Arguments.of(2,2),
                Arguments.of(10,4),
                Arguments.of(64,7)
        );
    }

    @ParameterizedTest
    @MethodSource("StreamForCubeTest")
    void IsCubedStreamTest(int input, boolean result){
        assertThat(ArythemicPrograming.IsCubed(input)).isEqualTo(result);
    }

    private static Stream<Arguments> StreamForCubeTest(){
        return Stream.of(
                Arguments.of(2,false),
                Arguments.of(-27,false),
                Arguments.of(64,true)
        );
    }

    @ParameterizedTest
    @MethodSource("StreamForAdvPowCalcTest")
    void AdvancedPowerCalculatorStreamTest(int input, int power, int result){
        assertThat(ArythemicPrograming.AdvancedPowerCalculator(input, power))
                .isEqualTo(result);
    }

    private static Stream<Arguments> StreamForAdvPowCalcTest(){
        return Stream.of(
                Arguments.of(2,7,128),
                Arguments.of(91,2,8281),
                Arguments.of(65,0,1)
        );
    }

    @ParameterizedTest
    @MethodSource("StreamForPrimeTest")
    void IsNumberPrimeStreamTest(int input, boolean result){
        assertThat(ArythemicPrograming.IsPrime(input))
                .isEqualTo(result);
    }

    private static Stream<Arguments> StreamForPrimeTest(){
        return Stream.of(
                Arguments.of(2,true),
                Arguments.of(11,true),
                Arguments.of(65,false),
                Arguments.of(1,false)
        );
    }

}