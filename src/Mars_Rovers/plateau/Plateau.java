package Mars_Rovers.plateau;


import Mars_Rovers.coordinate.Coordinate;
import Mars_Rovers.exceptions.InvalidPositionException;
import Mars_Rovers.face.Face;
import Mars_Rovers.position.Position;

public class Plateau {
    private Position roverPosition;
    private Coordinate upperRightCoordinate;

    public Plateau(Coordinate upperRightCoordinate) {
        this.upperRightCoordinate = upperRightCoordinate;
        this.roverPosition = null;
    }

    public Position createPosition(Coordinate coordinate, String face) throws InvalidPositionException {
        if(isValidCoordinate(coordinate)) {
            Position position = new Position(coordinate, Face.valueOf(face));
            this.roverPosition = position;
            return position;
        }
        throw new InvalidPositionException();
    }

    private boolean isValidCoordinate(Coordinate coordinate) {
        return this.upperRightCoordinate.isWithinLimit(coordinate);
    }

}
