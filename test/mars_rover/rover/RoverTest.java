package mars_rover.rover;


import Mars_Rovers.coordinate.Coordinate;
import Mars_Rovers.face.Face;
import Mars_Rovers.position.Position;
import Mars_Rovers.rover.Rover;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void should_spin_90_degree_to_the_left_and_should_face_west() {
        Position position = new Position(new Coordinate(1, 2), Face.NORTH);

        Rover rover = new Rover();
        rover.land(position);
        rover.turnLeft();

        Position positionAfterMoved = new Position(new Coordinate(1, 2), Face.WEST);
        assertEquals(positionAfterMoved, rover.currentPosition());
    }

    @Test
    public void should_spin_90_degree_to_the_right_and_should_face_east() {
        Position position = new Position(new Coordinate(1, 2), Face.NORTH);

        Rover rover = new Rover();
        rover.land(position);
        rover.turnRight();

        Position positionAfterMoved = new Position(new Coordinate(1, 2), Face.EAST);
        assertEquals(positionAfterMoved, rover.currentPosition());
    }

    @Test
    public void should_spin_90_degree_to_the_left_and_move_1_position_when_rover_is_facing_east() {
        Position position = new Position(new Coordinate(1, 2), Face.EAST);

        Rover rover = new Rover();
        rover.land(position);

        rover.move();
        Position positionAfterMoved = new Position(new Coordinate(1, 3), Face.EAST);
        assertEquals(positionAfterMoved, rover.currentPosition());
    }

//    @Test
//    public void should_spin_90_degree_to_the_right_and_move_1_position_when_RM_instruction_is_given() {
//        Position position = new Position(1, 2, Face.WEST);
//
//        Rover rover = new Rover();
//        rover.land(position);
//        rover.move("RM");
//
//        Position positionAfterMoved = new Position(1, 3, Face.NORTH);
//        assertEquals(positionAfterMoved, rover.currentPosition());
//    }
//
//    @Test
//    public void should_spin_90_degree_to_the_right_and_move_1_position_when_RM_instruction_is_given_if_it_facing_north() {
//        Position position = new Position(1, 2, Face.NORTH);
//        Rover rover = new Rover();
//        rover.land(position);
//        rover.move("RM");
//
//        Position positionAfterMoved = new Position(2, 2, Face.EAST);
//        assertEquals(positionAfterMoved, rover.currentPosition());
//    }
//
//    @Test
//    public void should_move_accordingly_when_multiple_instructions_are_given() {
//        Position position = new Position(1, 2, Face.NORTH);
//        Rover rover = new Rover();
//        rover.land(position);
//        rover.move("LMLMLMLMM");
//
//        Position positionAfterMoved = new Position(1, 3, Face.NORTH);
//        assertEquals(positionAfterMoved, rover.currentPosition());
//
//    }
//
//    @Test
//    public void should_move_first_then_turn_when_multiple_instructions_are_given() {
//        Position position = new Position(3, 3, Face.EAST);
//        Rover rover = new Rover();
//        rover.land(position);
//
//        rover.move("MMRMMRMRRM");
//        Position positionAfterMoved = new Position(5, 1, Face.EAST);
//        assertEquals(positionAfterMoved, rover.currentPosition());
//
//    }
}