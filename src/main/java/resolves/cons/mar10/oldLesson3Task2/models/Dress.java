package resolves.cons.mar10.oldLesson3Task2.models;

import resolves.cons.mar10.oldLesson3Task2.enums.Size;
import resolves.cons.mar10.oldLesson3Task2.interfaces.Woman;

public class Dress extends Clothes implements Woman {
    public Dress(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Dress woman in " + this.getClass().getSimpleName());
    }
}
