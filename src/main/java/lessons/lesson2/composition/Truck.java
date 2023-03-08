package lessons.lesson2.composition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Truck {
    private String manufacturer;
    private int seatCount;
    private Engine engine;

}
