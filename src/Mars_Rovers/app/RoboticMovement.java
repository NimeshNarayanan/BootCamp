package Mars_Rovers.app;

import Mars_Rovers.coordinate.Coordinate;
import Mars_Rovers.exceptions.InvalidPositionException;
import Mars_Rovers.plateau.Plateau;
import Mars_Rovers.position.Position;
import Mars_Rovers.rover.Rover;

public class RoboticMovement {

    public static void main(String[] args) throws InvalidPositionException {
        String instructions = "LMLMLMLMM";
        Plateau plateau = new Plateau(new Coordinate(5,5));
        Coordinate coordinate = new Coordinate(1,2);
        Position position = plateau.createPosition(coordinate, "NORTH");

        Rover rover = new Rover();
        rover.land(position);

//        rover.move(instructions);
        System.out.println(rover.currentPosition().toString());
    }
}
