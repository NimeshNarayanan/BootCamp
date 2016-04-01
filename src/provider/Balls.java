package provider;

import provider.ball.Ball;

import java.util.ArrayList;
import java.util.Iterator;

public class Balls implements Iterable<Ball> {
    private final ArrayList<Ball> balls;

    public Balls() {
        this.balls = new ArrayList<Ball>();
    }

    public boolean add(Ball ball) {
        return balls.add(ball);
    }

    public int numberOfBallsOfColour(Color colour) {
        int count = 0;
        for (Ball ball :
                balls) {
            if (ball.isTheSameColor(colour))
                count++;
        }
        return count;
    }

    public int size() {
        return balls.size();
    }

    @Override
    public Iterator<Ball> iterator() {
        return balls.iterator();
    }
}
