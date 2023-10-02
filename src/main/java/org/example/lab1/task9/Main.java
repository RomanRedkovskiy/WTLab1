package org.example.lab1.task9;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>(Set.of(
                new Ball(Color.RED, 10),
                new Ball(Color.YELLOW, 23),
                new Ball(Color.GREEN, 26),
                new Ball(Color.BLUE, 31),
                new Ball(Color.BLUE, 1100),
                new Ball(Color.PURPLE, 7)
        ));
        Bucket bucket = new Bucket(balls);

        System.out.println("Balls weight in a bucket: " + BucketOperations.calculateBallsWeight(bucket));
        System.out.println("Blue balls amount: " + BucketOperations.calculateBlueBallsAmount(bucket));
    }
}
