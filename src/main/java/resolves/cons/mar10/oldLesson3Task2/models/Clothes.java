package resolves.cons.mar10.oldLesson3Task2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import resolves.cons.mar10.oldLesson3Task2.enums.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
abstract public class Clothes {
    private Size size;
    private int cost;
    private String color;
}
