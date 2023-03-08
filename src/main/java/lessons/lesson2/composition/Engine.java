package lessons.lesson2.composition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Engine extends Object {
    private int volume;
    private int power;
    private String mark;

    public void drive() {
        System.out.println("ajhadhsd");
    }


}
