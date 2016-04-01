package provider;

import provider.ball.Ball;
import rules.Rule;
import rules.Rules;

public class Bag {
    private static int MAX_NO_OF_BALL = 12;
    private final Rules rules;
    private final Balls balls;


    public Bag(int maxBallLimit, Rules rules) {
        this.MAX_NO_OF_BALL = MAX_NO_OF_BALL;
        this.rules = rules;
        this.balls = new Balls();
    }

    public boolean add(Ball ball) {
        if(isFull())
            return false;
        for (Rule rule : rules) {
            if(!rule.canBeAdded(ball, balls))
                return false;
        }
        return balls.add(ball);
    }

    public boolean isFull(){
        return balls.size()==MAX_NO_OF_BALL;
    }
}
