package org.example.lab1.task9;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BucketOperationsTest {

    @Test
    void calculateBallsWeightWhenEmptySetShouldReturnZero() {
        //given
        Bucket bucket = new Bucket(new HashSet<>());
        int expected = 0;
        //when
        int actual = BucketOperations.calculateBallsWeight(bucket);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void calculateBlueBallsAmountWhenEmptySetShouldReturnZero() {
        //given
        Bucket bucket = new Bucket(new HashSet<>());
        long expected = 0;
        //when
        long actual = BucketOperations.calculateBlueBallsAmount(bucket);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void calculateBlueBallsAmountWhenNoBlueBallsShouldReturnZero() {
        //given
        Ball firstBall = new Ball(Color.RED, 10);
        Ball secondBall = new Ball(Color.PURPLE, 23);
        Ball thirdBall = new Ball(Color.GREEN, 26);
        Set<Ball> ballSet = new HashSet<>(Set.of(
                firstBall,
                secondBall,
                thirdBall
        ));
        Bucket bucket = new Bucket(ballSet);
        long expected = 0;
        //when
        long actual = BucketOperations.calculateBlueBallsAmount(bucket);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void calculateBlueBallsAmountWhenBlueBallsOnlyShouldReturnBucketSize() {
        //given
        Ball firstBall = new Ball(Color.BLUE, 10);
        Ball secondBall = new Ball(Color.BLUE, 23);
        Ball thirdBall = new Ball(Color.BLUE, 26);
        Set<Ball> ballSet = new HashSet<>(Set.of(
                firstBall,
                secondBall,
                thirdBall
        ));
        Bucket bucket = new Bucket(ballSet);
        long expected = ballSet.size();
        //when
        long actual = BucketOperations.calculateBlueBallsAmount(bucket);
        //then
        assertEquals(expected, actual);
    }
}