package rules;

import provider.Balls;
import provider.Color;
import provider.ball.Ball;

public class GreenBallRule implements Rule {
    private static final int MAX_LIMIT = 3;

    @Override
    public boolean canBeAdded(Ball ball, Balls balls) {
        return !ball.isTheSameColor(Color.GREEN) || balls.numberOfBallsOfColour(Color.GREEN) < MAX_LIMIT;
    }
}
