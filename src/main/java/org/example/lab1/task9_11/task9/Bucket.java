package org.example.lab1.task9_11.task9;

import java.util.HashSet;
import java.util.Set;

public class Bucket {

    private Set<Ball> balls = new HashSet<>();

    public Bucket() {
    }

    public Bucket(Set<Ball> balls) {
        this.balls = balls;
    }

    public Set<Ball> getBalls() {
        return balls;
    }
}
