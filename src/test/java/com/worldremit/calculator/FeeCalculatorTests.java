package com.worldremit.calculator;

import com.worldremit.calculator.domain.TransferData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FeeCalculatorTest {

    @ParameterizedTest
    @MethodSource("getSampleData")
    void test(TransferData transferData, Integer expectedFee) {
        // given
        final FeeCalculator calculator = new FeeCalculator() {
        };

        // when
        final Integer resultFee = calculator.calculateFee(transferData);

        // then
        Assertions.assertEquals(expectedFee, resultFee);
    }

    private static Stream<Arguments> getSampleData() {
        return Stream.of(
                Arguments.of(new TransferData("Wordland", "Wordland", 100, "No comment"), 1),
                Arguments.of(new TransferData("Wordland", "Wordland", 10000, "No comment"), 1),
                Arguments.of(new TransferData("Wordland", "Wordland", 100000, "No comment"), 100),
                Arguments.of(new TransferData("Wordland", "Remitania", 1, "No comment"), 1000),
                Arguments.of(new TransferData("Remitania", "Remitania", 3000, "No comment"), 15),
                Arguments.of(new TransferData("Remitania", "Wordland", 1000, "Do you remember the summer 2010?"), 0)
        );
    }
}
