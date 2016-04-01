package Mars_Rovers.rover;


import Mars_Rovers.position.Position;

public class Rover {

    private Position position;

    public Rover() {
        this.position = null;
    }

    public Position currentPosition() {
        return position;
    }

    public void land(Position position) {
        this.position = position;
    }

    public void turnLeft() {
        this.position = position.spinToLeft();
    }

    public void turnRight() {
        this.position = position.spinToRight();
    }

    public void move() {
        
    }
}
