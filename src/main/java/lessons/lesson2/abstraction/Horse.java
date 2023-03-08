package lessons.lesson2.abstraction;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
class Horse extends Animal {
    private String breed;

    public Horse() {
    }

    public Horse(int legs, boolean brain, String breed) {
        super(legs, brain);
        this.breed = breed;
    }

    @Override
    public void scream() {
        //....1
    }
}
