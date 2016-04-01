package provider;

import org.junit.Test;
import provider.ball.Ball;
import rules.YellowBallRule;

import static org.junit.Assert.*;

public class YellowBallRuleTest {

    @Test
    public void canBeAdded() {
        YellowBallRule yellowBallRule = new YellowBallRule();
        Balls balls = new Balls();
        balls.add(new Ball(Color.GREEN));
        balls.add(new Ball(Color.GREEN));
        balls.add(new Ball(Color.GREEN));
        balls.add(new Ball(Color.YELLOW));
        assertTrue(yellowBallRule.canBeAdded(new Ball(Color.YELLOW), balls));
        balls.add(new Ball(Color.YELLOW));


    }
}