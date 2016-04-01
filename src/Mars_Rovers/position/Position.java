package Mars_Rovers.position;


import Mars_Rovers.coordinate.Coordinate;
import Mars_Rovers.face.Face;

import java.util.HashMap;

public class Position {
    private final HashMap<Face,Face> leftNeighbourFaces = new HashMap<Face, Face>(){{
        put(Face.NORTH,Face.WEST);
        put(Face.WEST,Face.SOUTH);
        put(Face.SOUTH,Face.EAST);
        put(Face.EAST,Face.NORTH);
    }};
    private final HashMap<Face,Face> rightNeighbourFaces = new HashMap<Face, Face>(){{
        put(Face.NORTH,Face.EAST);
        put(Face.EAST,Face.SOUTH);
        put(Face.SOUTH,Face.WEST);
        put(Face.WEST, Face.NORTH);
    }};

    private Coordinate coordinate;
    private Face face;

    public Position(Coordinate coordinate, Face face) {
        this.coordinate = coordinate;
        this.face = face;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (!coordinate.equals(position.coordinate)) return false;
        return face == position.face;

    }

    public Position spinToLeft() {
        return new Position(coordinate, leftNeighbourFaces.get(this.face));
    }

    public Position spinToRight() {
        return new Position(coordinate, rightNeighbourFaces.get(this.face));
    }

}
