/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sample.java.proj;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.util.Arrays;

class AppTest {
    @Test 
    void appHasAGreeting() {
        App classUnderTest = buildClassUnderTest();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @ParameterizedTest
    @CsvSource({
        "1|2|1|2|3|4,true",
        "1|2|1|2|1|2|3|4,false",
        "1|2|1|2|1|2|3|4|5|6,false"
    })
    void appIsPossibleSplit(String input,boolean expecResp){
        App classUnderTest = buildClassUnderTest();
        int[] inputs = buildIntArr(input);
        boolean resp = classUnderTest.isPossibleToSplit(inputs);
        assertTrue(expecResp==resp);
    }

    @ParameterizedTest
    @CsvSource({
        "1|0|2|0|1|2|3|4,1|2|1|2|3|4|0|0",
        "1|2|0|1|2|1|2|3|4,1|2|1|2|1|2|3|4|0",
        "1|2|1|0|2|1|0|2|3|4|5|6,1|2|1|2|1|2|3|4|5|6|0|0"
    })
    void appSortArray(String input,String expecOutput){
        App classUnderTest = buildClassUnderTest();
        int[] inputs = buildIntArr(input);
        int[] resp = classUnderTest.arraySort(inputs);
        assertThat(resp).isEqualTo(buildIntArr(expecOutput));
    }

    private int[] buildIntArr(String input) {
        int[] inputs = Arrays.stream(input.split("\\|")).mapToInt(Integer::parseInt).toArray();
        return inputs;
    }

    private App buildClassUnderTest() {
        App classUnderTest = new App();
        return classUnderTest;
    }

    @ParameterizedTest
    @CsvSource({
        "1|0|2|0|1|2|3|4,3",
        "1|2|0|1|2|1|2|3|4,4",
        "1|2|1|0|2|1|0|2|3|4|5|6,6"
    })
    void testFindIndexForSum(String input,int sum){
        int[] resp = buildClassUnderTest().findIndexesWithCount(buildIntArr(input), sum);
        assertTrue(resp.length>0);
    }

    @ParameterizedTest
    @CsvSource({
        "1|0|2|0|1|2|3|4,0|0|1|1|2|2|3|4",
        "1|2|0|1|2|1|2|3|4,0|1|1|1|2|2|2|3|4",
        "6|2|1|0|2|1|0|2|3|4|5|1,0|0|1|1|1|2|2|2|3|4|5|6",
        "6|5|4|3|2|1|0,0|1|2|3|4|5|6"
    })
    void testArraySort(String input,String expecOutput){
        int[] resp = buildClassUnderTest().selectionSortArray(buildIntArr(input));
        assertThat(resp).isEqualTo(buildIntArr(expecOutput));
    }

    @ParameterizedTest
    @CsvSource({
        "1,1",
        "2,2",
        "3,6",
        "4,24",
        "5,120",
        "6,720"
    })
    void testFactorialUsingLoop(int input,String expecOutput){
        BigInteger expecFactorial = new BigInteger(expecOutput);
        BigInteger output = buildClassUnderTest().factorialUsingLoop(input);
        assertEquals(expecFactorial, output);
    }

    @ParameterizedTest
    @CsvSource({
        "1,1",
        "2,2",
        "3,6",
        "4,24",
        "5,120",
        "6,720"
    })
    void testFactorialUsingRecursion(int input,String expecOutput){
        BigInteger expecFactorial = new BigInteger(expecOutput);
        BigInteger output = buildClassUnderTest().factorialusingRecursion(BigInteger.valueOf(input));
        assertEquals(expecFactorial, output);
    }

    @ParameterizedTest
    @CsvSource({
        "1,1",
        "2,10",
        "3,11"
    })
    void testConvertIntToBinary(int input,String expecOutput){
        String actualOutput = buildClassUnderTest().convertInttoBinary(input);
        assertEquals(expecOutput, actualOutput);
    }

    @ParameterizedTest
    @CsvSource({
        "1,1",
        "2,10",
        "3,11"
    })
    void testConvertIntToBinaryUsingRecursion(int input,String expecOutput){
        String actualOutput = buildClassUnderTest().convertInttoBinaryUsingRecurssion(input);
        assertEquals(expecOutput, actualOutput);
    }

    @ParameterizedTest
    @CsvSource({
        "1|2|3|4|5,15",
        "1|2|3|4|5|-6,9"
    })
    void testSumofArray(String input,int expecOutput){
        int actualOutput = buildClassUnderTest().sumofArray(buildIntArr(input));
        assertEquals(expecOutput, actualOutput);
    }

    @ParameterizedTest
    @CsvSource({
        "1|2|3|4|5,1,5|1|2|3|4",
        "1|2|3|4|5,2,4|5|1|2|3",
        "1|2|3|4|5,3,3|4|5|1|2",
        "1|2|3|4|5,4,2|3|4|5|1"
    })
    void testArrayRotationRight(String input,int step,String expecOutput){
        int[] actualOutput = buildClassUnderTest().arrayRotationRight(buildIntArr(input), step);
        assertThat(actualOutput).isEqualTo(buildIntArr(expecOutput));
    }

    @ParameterizedTest
    @CsvSource({
        "1|2|3|4|5,1,2|3|4|5|1",
        "1|2|3|4|5,2,3|4|5|1|2",
        "1|2|3|4|5,3,4|5|1|2|3",
        "1|2|3|4|5,4,5|1|2|3|4"
    })
    void testArrayRotationLeft(String input,int step,String expecOutput){
        int[] actualOutput = buildClassUnderTest().arrayRotationLeft(buildIntArr(input), step);
        assertThat(actualOutput).isEqualTo(buildIntArr(expecOutput));
    }

}
