package org.example.lab1.task9_11.task9;

public class BucketOperations {

    public static int calculateBallsWeight(Bucket bucket) {
        return bucket.getBalls().stream().mapToInt(x -> x.weight()).sum();
    }

    public static long calculateBlueBallsAmount(Bucket bucket) {
        return bucket.getBalls().stream().filter(x -> x.color().equals(Color.BLUE)).count();
    }
}
