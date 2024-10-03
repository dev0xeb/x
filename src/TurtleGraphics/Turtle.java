package TurtleGraphics;
import static TurtleGraphics.TurtleZone.*;
public class Turtle {
    private boolean penIsUp = true;
    private TurtleZone currentDirection = EAST;
    public boolean penIsUp() {
        return penIsUp;
    }

    public void movePenDown() {
        this.penIsUp = false;
    }
    public void movePenUp() {
        this.penIsUp = true;
    }

    public void turnRight() {
        if(currentDirection == SOUTH) currentDirection = WEST;
        if(currentDirection == EAST) currentDirection = SOUTH;
        if(currentDirection == WEST) currentDirection = NORTH;
        if(currentDirection == NORTH) currentDirection = EAST;
    }

    public TurtleZone getCurrentDirection() {
        return currentDirection;
    }
}
