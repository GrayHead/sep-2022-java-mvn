package resolves.cons.mar10.oldLesson3Task2.models;

import resolves.cons.mar10.oldLesson3Task2.enums.Size;
import resolves.cons.mar10.oldLesson3Task2.interfaces.Man;
import resolves.cons.mar10.oldLesson3Task2.interfaces.Woman;

public class TShort extends Clothes implements Man, Woman {
    public TShort(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void DressMan() {
        System.out.println("Dress man in " + this.getClass().getSimpleName());
    }

    @Override
    public void dressWomen() {
        System.out.println("Dress woman in " + this.getClass().getSimpleName());
    }
}
