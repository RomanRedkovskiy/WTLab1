package org.example.lab1.task1;

public class EquationSolver {

    public double calculate(double x, double y) {
        double numerator = 1f + Math.pow(Math.sin(x + y), 2);
        double denominator = 2f + Math.abs(x - (2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2)));
        return numerator / denominator + x;
    }
}
