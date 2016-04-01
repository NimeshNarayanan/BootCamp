package provider;

import org.junit.Before;
import org.junit.Test;
import provider.ball.Ball;
import rules.GreenBallRule;
import rules.RedBallRule;
import rules.Rules;
import rules.YellowBallRule;

import static org.junit.Assert.*;

public class BagTest {

    private Bag bag;

    @Before
    public void setUp() throws Exception {
        Rules rules = new Rules();
        rules.add(new GreenBallRule());
        rules.add(new YellowBallRule());
        rules.add(new RedBallRule());
        this.bag = new Bag(12, rules);
    }

    @Test
    public void balls_can_be_added_to_the_bag() {
        Ball ball = new Ball(Color.GREEN);
        assertTrue(bag.add(ball));
    }

    @Test
    public void bag_can_hold_maximum_12_balls() {
        Ball greenBall = new Ball(Color.GREEN);
        Ball blueBall = new Ball(Color.BLUE);
        Ball redBall = new Ball(Color.RED);
        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(greenBall));

        assertTrue(bag.add(blueBall));
        assertTrue(bag.add(blueBall));
        assertTrue(bag.add(blueBall));

        assertTrue(bag.add(redBall));
        assertTrue(bag.add(redBall));
        assertTrue(bag.add(redBall));

        assertTrue(bag.add(blueBall));
        assertTrue(bag.add(blueBall));
        assertTrue(bag.add(blueBall));

        assertFalse(bag.add(blueBall));
    }

    @Test
    public void bag_can_not_hold_more_than_3_balls_of_any_colour() {
        Ball greenBall = new Ball(Color.GREEN);

        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(greenBall));

        assertFalse(bag.add(greenBall));
    }

    @Test
    public void bag_cannot_add_red_balls_without_any_green_balls() {
        Ball redBall = new Ball(Color.RED);

        assertFalse(bag.add(redBall));
    }

    @Test
    public void bag_cannot_add_red_balls_more_than_double_the_number_of_green_balls() {
        Ball greenBall = new Ball(Color.GREEN);
        Ball redBall = new Ball(Color.RED);
        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(redBall));
        assertTrue(bag.add(redBall));
        assertFalse(bag.add(redBall));
    }

    @Test
    public void bag_cannot_add_yellow_balls_more_than_40_percent_the_total_number_balls_in_bag() {
        Ball greenBall = new Ball(Color.GREEN);
        Ball redBall = new Ball(Color.RED);
        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(redBall));
        assertTrue(bag.add(redBall));
        assertTrue(bag.add(new Ball(Color.YELLOW)));
        assertTrue(bag.add(new Ball(Color.YELLOW)));
        assertFalse(bag.add(new Ball(Color.YELLOW)));
    }
}
