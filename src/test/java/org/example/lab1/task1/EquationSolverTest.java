package org.example.lab1.task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EquationSolverTest {

    private static final double DELTA = 1e-6;
    private final EquationSolver calculator = new EquationSolver();

    @Test
    void calculateWhenZeroNumbersShouldReturnResult() {
        //given
        double x = 0;
        double y = 0;
        //when
        double expected = 0.5;
        double actual = calculator.calculate(x, y);
        //then
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateWhenPositiveNumbersShouldReturnResult() {
        //given
        double x = 10.0;
        double y = 23.0;
        //when
        double expected = 10.166657;
        double actual = calculator.calculate(x, y);
        //then
        assertEquals(expected, actual, DELTA);
    }

    @Test
    void calculateWhenNegativeNumbersShouldReturnResult() {
        //given
        double x = -7;
        double y = -3;
        //when
        double expected = -6.855496;
        double actual = calculator.calculate(x, y);
        //then
        assertEquals(expected, actual, DELTA);
    }

}
