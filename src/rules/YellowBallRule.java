package rules;

import provider.Balls;
import provider.Color;
import provider.ball.Ball;

public class YellowBallRule implements Rule {
    @Override
    public boolean canBeAdded(Ball ball, Balls balls) {
        return !ball.isTheSameColor(Color.YELLOW)
                || (balls.numberOfBallsOfColour(Color.YELLOW)*100)/balls.size() < 40;
    }
}
