package resolves.cons.mar10.oldLesson3Task2.models;

import resolves.cons.mar10.oldLesson3Task2.enums.Size;
import resolves.cons.mar10.oldLesson3Task2.interfaces.Man;

public class Tie extends Clothes implements Man {
    public Tie(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void DressMan() {
        System.out.println("Dress man in " + this.getClass().getSimpleName());
    }
}
