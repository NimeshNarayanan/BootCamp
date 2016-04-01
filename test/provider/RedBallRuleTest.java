package provider;

import org.junit.Test;
import provider.ball.Ball;
import rules.RedBallRule;

import static org.junit.Assert.*;

public class RedBallRuleTest {

    @Test
    public void CanBeAdded() {
        RedBallRule redBallRule = new RedBallRule();
        Balls balls = new Balls();
        balls.add(new Ball(Color.GREEN));
        balls.add(new Ball(Color.GREEN));
        assertTrue(redBallRule.canBeAdded(new Ball(Color.RED), balls));

        balls.add(new Ball(Color.RED));
        balls.add(new Ball(Color.RED));
        balls.add(new Ball(Color.RED));
        balls.add(new Ball(Color.RED));

        assertFalse(redBallRule.canBeAdded(new Ball(Color.RED), balls));
    }
}