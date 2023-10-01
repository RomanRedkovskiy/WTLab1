package org.example.lab1.task3;

import java.util.Map;

public class TanOnSegmentSolver {

    private final SegmentFunction segmentFunction = Math::tan;
    private final FunctionOnSegmentSolver functionOnSegmentSolver = new FunctionOnSegmentSolver();

    public Map<Double, Double> calculate(Segment segment, double step) {
        return functionOnSegmentSolver.calculate(segmentFunction, segment, step);
    }
}
