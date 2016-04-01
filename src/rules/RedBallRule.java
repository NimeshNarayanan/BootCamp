package rules;

import provider.Balls;
import provider.Color;
import provider.ball.Ball;

public class RedBallRule implements Rule {
    @Override
    public boolean canBeAdded(Ball ball, Balls balls) {
        return !ball.isTheSameColor(Color.RED)
                || (balls.numberOfBallsOfColour(Color.GREEN) * 2) > balls.numberOfBallsOfColour(Color.RED);
    }
}
