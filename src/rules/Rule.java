package rules;

import provider.Balls;
import provider.ball.Ball;

public interface Rule {
    boolean canBeAdded(Ball ball, Balls balls);
}
