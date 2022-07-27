package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/calcSqrAmount.csv")
    public void shouldCalcSqrAmountInitialBoundary(int expected, int minValue, int maxValue) {
        SQRService service = new SQRService();

        //int expected = 3;
        //int minValue = 200;
        //int maxValue = 300;

        int actual = service.calcAmountSquare(minValue, maxValue);

        Assertions.assertEquals(expected, actual);

        //}

        //@Test
        //public void shouldCalcSqrAmountLowerBoundary() {
        //  SQRService service = new SQRService();

        //int expected = 1;
        //int minValue = 100;
        //int maxValue = 100;

        //  int actual = service.calcAmountSquare(minValue, maxValue);

        // Assertions.assertEquals(expected, actual);
        //}

        //@Test
        //public void shouldCalcSqrAmountUnderLowerBoundary() {
        //  SQRService service = new SQRService();

        //int expected = 0;
        //int minValue = 5;
        //int maxValue = 99;

        //int actual = service.calcAmountSquare(minValue, maxValue);

        //Assertions.assertEquals(expected, actual);
        //}

        //@Test
        //public void shouldCalcSQrAmountUpperBoundary() {
        //  SQRService service = new SQRService();

        //int expected = 90;
        //int minValue = 100;
        //int maxValue = 9_801;

        //int actual = service.calcAmountSquare(minValue, maxValue);

        //Assertions.assertEquals(expected, actual);
        //}

        //@Test
        //public void shouldCalcSqrAmountOverUpperBoundary() {
        // SQRService service = new SQRService();

        //int expected = 90;
        //int minValue = 100;
        // int maxValue = 50_000;

        //int actual = service.calcAmountSquare(minValue, maxValue);

        //  Assertions.assertEquals(expected, actual);
        // }

        // @Test
        //public void shouldCalcSqrAmountBeyoundUpperBoundary() {
        //SQRService service = new SQRService();

        //int expected = 0;
        //int minValue = 10_000;
        //int maxValue = 79_000;

        //int actual = service.calcAmountSquare(minValue, maxValue);

        //Assertions.assertEquals(expected,actual);
//}

        //@Test
        //public void shouldCalcSqrAmountNextAfterLowerBoundary() {
        //SQRService service = new SQRService();

        //int expected = 89;
        //int minValue = 121;
        //int maxValue = 9801;

        //int actual = service.calcAmountSquare(minValue, maxValue);

        //Assertions.assertEquals(expected, actual);
        //}

        //@Test
        //public void shouldCalcSqrAmountBeforeUpperBoundary() {
        //SQRService service = new SQRService();

        // int expected = 89;
        // int minValue = 100;
        // int maxValue = 9604;

        // int actual = service.calcAmountSquare(minValue, maxValue);

        // Assertions.assertEquals(expected, actual);
        //}
    }
}