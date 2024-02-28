package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/*
 - 요구사항
 - 간단한 사칙연산을 할 수 있다.
 - 양수로만 할 수 있다
 - 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다
 - MVC 패턴(Model-View-Controller) 기반으로 구현한다
 */
public class CalculatorTest {

    // 1 + 2 ----> Calculator
    //   3   <----
    @DisplayName("사칙 연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void calculatorTest(int operand1, String operator, int operand2, int result) {

        int calculatorResult = Calculator.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));

        assertThat(calculatorResult).isEqualTo(result);
    }

    private static Stream<Arguments> formulaAndResult() {

        return Stream.of(
                arguments(10, "+", 20, 30),
                arguments(1, "-", 2, -1),
                arguments(4, "*", 2, 8),
                arguments(4, "/", 2, 2)
        );
    }
}
