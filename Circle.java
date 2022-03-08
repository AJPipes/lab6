import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Circle extends SimpleShape {

    protected int radius;

    public Circle(int r) {
        radius = r;
        xLoc += radius + 10;
    }

    public void calculateArea() {
        int r2 = radius * radius;
        area = radius * Math.PI;
    }

    public String toString() {
        return "Circle" + super.toString();

    }

}
