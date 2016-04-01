package mars_rover.plateau;


import Mars_Rovers.coordinate.Coordinate;
import Mars_Rovers.exceptions.InvalidPositionException;
import Mars_Rovers.face.Face;
import Mars_Rovers.plateau.Plateau;
import Mars_Rovers.position.Position;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class PlateauTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_create_a_position_for_a_placing_an_object() throws InvalidPositionException {
        Plateau plateau = new Plateau(new Coordinate(3, 3));
        Position position = new Position(new Coordinate(1, 2), Face.NORTH);
        assertEquals(position, plateau.createPosition(new Coordinate(1, 2), "NORTH"));
    }

    @Test
    public void should_throw_InvalidPositionException_when_given_position_to_create_is_not_valid() throws InvalidPositionException {
        Plateau plateau = new Plateau(new Coordinate(3, 3));

        thrown.expect(InvalidPositionException.class);
        plateau.createPosition(new Coordinate(4, 2), "NORTH");
    }
}