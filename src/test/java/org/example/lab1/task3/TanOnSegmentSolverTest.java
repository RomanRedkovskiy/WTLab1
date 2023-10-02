package org.example.lab1.task3;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TanOnSegmentSolverTest {

    private static final double DELTA = 1e-6;
    private final TanOnSegmentSolver calculator = new TanOnSegmentSolver();


    @Test
    void calculateWhenSmallSegmentShouldReturnTanOnSegmentTable() {
        //given
        Segment segment = new Segment(0.2, 0.234);
        double step = 0.1;
        //when
        Map<Double, Double> result = calculator.calculate(segment, step);
        //then
        checkTable(result, segment.start(), step);
    }

    @Test
    void calculateWhenBigStepShouldReturnTanOnSegmentTable() {
        //given
        Segment segment = new Segment(-10.2, 30.3);
        double step = 50;
        //when
        Map<Double, Double> result = calculator.calculate(segment, step);
        //then
        checkTable(result, segment.start(), step);
    }

    @Test
    void calculateWhenManyValuesShouldReturnTanOnSegmentTable() {
        //given
        Segment segment = new Segment(-69.1, 47.0);
        double step = 0.1;
        //when
        Map<Double, Double> result = calculator.calculate(segment, step);
        //then
        checkTable(result, segment.start(), step);
    }

    private static void checkTable(Map<Double, Double> table, double start, double step){
        for(Map.Entry<Double, Double> entry : table.entrySet()){
            double expectedValue = Math.tan(start);
            assertEquals(start, entry.getKey(), DELTA); //check step correctness
            assertEquals(expectedValue, entry.getValue(), DELTA);
            start += step;
        }
    }

}
