package chance;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ChanceTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Test
    public void Exception_should_be_thrown_when_value_less_than_one_is_given() throws Exception {
        exception.expect(InvalidProbabilityException.class);
        exception.expectMessage("Probability can't be greater than one or less than zero but got -1.0");
        Chance.create(-1);
    }

    @Test
    public void Exception_should_be_thrown_when_value_greater_than_one_is_given() throws Exception {
        exception.expect(InvalidProbabilityException.class);
        exception.expectMessage("Probability can't be greater than one or less than zero but got 2.0");
        Chance.create(2);
    }

    @Test
    public void chance_can_be_negated() throws Exception {
        Chance chance = Chance.create(0.75);
        Chance expected = Chance.create(0.25);
        assertEquals(expected,chance.negate());
    }

    @Test
    public void chance_can_be_ored() throws InvalidProbabilityException {
        Chance chance = Chance.create(0.75);
        Chance chance1 = Chance.create(0.25);
        Chance expected = Chance.create(1);
        assertEquals(expected,chance.or(chance1));
    }

    @Test
    public void chance_can_be_and() throws InvalidProbabilityException {
        Chance chance = Chance.create(0.75);
        Chance chance1 = Chance.create(0.25);
        Chance expected = Chance.create(0.1875);
        assertEquals(expected,chance.and(chance1));
    }
}