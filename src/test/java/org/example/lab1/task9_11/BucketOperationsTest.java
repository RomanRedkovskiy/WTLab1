package org.example.lab1.task9_11;

import java.util.HashSet;
import java.util.Set;

import org.example.lab1.task9_11.task9.Ball;
import org.example.lab1.task9_11.task9.Bucket;
import org.example.lab1.task9_11.task9.BucketOperations;
import org.example.lab1.task9_11.task9.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BucketOperationsTest {

    @Test
    void calculateBallsWeightWhenEmptySetShouldReturnZero() {
        //given
        Bucket bucket = new Bucket(new HashSet<>());
        //when
        int actual = BucketOperations.calculateBallsWeight(bucket);
        int expected = 0;
        //then
        assertEquals(expected, actual);
    }

    @Test
    void calculateBlueBallsAmountWhenEmptySetShouldReturnZero() {
        //given
        Bucket bucket = new Bucket(new HashSet<>());
        //when
        long actual = BucketOperations.calculateBlueBallsAmount(bucket);
        long expected = 0;
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
        //when
        long actual = BucketOperations.calculateBlueBallsAmount(bucket);
        long expected = 0;
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
        //when
        long actual = BucketOperations.calculateBlueBallsAmount(bucket);
        long expected = ballSet.size();
        //then
        assertEquals(expected, actual);
    }
}