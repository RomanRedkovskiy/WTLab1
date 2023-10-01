package org.example.lab1.task3;

import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionOnSegmentSolver {

    public Map<Double, Double> calculate(SegmentFunction segmentFunction, Segment segment, double step) {
        Map<Double, Double> result = new LinkedHashMap<>();
        int numSteps = (int) ((segment.end() - segment.start()) / step);

        for (int i = 0; i < numSteps; i++) {
            double x = segment.start() + i * step; //current step
            double value = segmentFunction.calculate(x); //current value
            result.put(x, value);
        }
        return result;
    }
}
