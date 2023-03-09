package resolves.hw3.task1.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import resolves.hw3.task1.interfaces.Printable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Magazines implements Printable {
    private String name;

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + " - " + this.name);
    }
}
