package resolves.cons.mar10;

import resolves.cons.mar10.models.Rectangle;
import resolves.cons.mar10.models.Shape;
import resolves.cons.mar10.models.Triangle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Triangle(1,2,4));
        shapes.add(new Triangle(4,5,7));
        shapes.add(new Rectangle(2,3));

        for (Shape shape : shapes) {
            shape.area();
            shape.perimeter();
        }
    }


}
