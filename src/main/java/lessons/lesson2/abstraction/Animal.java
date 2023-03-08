package lessons.lesson2.abstraction;

import lombok.Data;

@Data
abstract class Animal {
    private int legs;
    private boolean brain;

    public Animal() {
    }

    public Animal(int legs, boolean brain) {
        this.legs = legs;
        this.brain = brain;
    }

    public abstract void scream();
}
