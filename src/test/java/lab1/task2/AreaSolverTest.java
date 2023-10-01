package lab1.task2;

import org.example.lab1.task2.modelSolvers.RectanglesAreaSolver;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AreaSolverTest {

    private final RectanglesAreaSolver rectangleAreaChecker = new RectanglesAreaSolver();

    @Test
    void isDotInAreaWhenInsideShouldReturnTrue() {
        //given
        int x = 2;
        int y = 3;
        Point point = new Point(x, y);
        //when
        boolean actual = rectangleAreaChecker.isDotInArea(point);
        //then
        assertTrue(actual);
    }

    @Test
    void isDotInAreaWhenOnBorderShouldReturnFalse() {
        //given
        int x = 6;
        int y = -3;
        Point point = new Point(x, y);
        //when
        boolean actual = rectangleAreaChecker.isDotInArea(point);
        //then
        assertTrue(actual);
    }

    @Test
    void isDotInAreaWhenOutsideShouldReturnFalse() {
        //given
        int x = 69;
        int y = 2;
        Point point = new Point(x, y);
        //when
        boolean actual = rectangleAreaChecker.isDotInArea(point);
        //then
        assertFalse(actual);
    }
}
