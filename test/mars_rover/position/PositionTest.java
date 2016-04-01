package position;


import Mars_Rovers.coordinate.Coordinate;
import Mars_Rovers.face.Face;
import Mars_Rovers.position.Position;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTest {
    @Test
    public void two_positions_with_same_co_ordinates_and_same_face_should_be_equal() {
        Position position = new Position(new Coordinate(1,2), Face.NORTH);
        Position otherPosition = new Position(new Coordinate(1,2), Face.NORTH);
        assertEquals(position, otherPosition);
    }

    @Test
    public void should_spin_to_west_when_it_was_facing_north_for_spinToLeft() {
        Position position = new Position(new Coordinate(1, 2), Face.NORTH);
        Position expectedPosition = new Position(new Coordinate(1,2), Face.WEST);

        assertEquals(expectedPosition, position.spinToLeft());
    }

    @Test
    public void should_spin_to_south_when_it_was_facing_eash_for_spinToRight() {
        Position position = new Position(new Coordinate(1, 2), Face.EAST);
        Position expectedPosition = new Position(new Coordinate(1,2), Face.SOUTH);

        assertEquals(expectedPosition, position.spinToRight());
    }
}