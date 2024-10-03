package TurtleGraphics;

import org.junit.jupiter.api.Test;

import static TurtleGraphics.TurtleZone.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    @Test
    public void testTurtlePenIsUp() {
        Turtle turtle = new Turtle();
        assertTrue(turtle.penIsUp());
    }
    @Test
    public void testMoveTurtlePenDown() {
        Turtle turtle = new Turtle();
        assertTrue(turtle.penIsUp());
        turtle.movePenDown();
        assertFalse(turtle.penIsUp());
    }

    @Test
    public void testMoveTurtlePenUp() {
        Turtle turtle = new Turtle();
        assertTrue(turtle.penIsUp());
        turtle.movePenUp();
        assertTrue(turtle.penIsUp());
    }
    @Test
    public void testTurtlePenCanTurnRightWhenFacingEast(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void testTurtlePenCanTurnRightWhenFacingSouth(){
        Turtle turtle = new Turtle();
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }
}
