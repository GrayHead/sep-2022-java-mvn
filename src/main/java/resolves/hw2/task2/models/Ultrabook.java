package resolves.hw2.task2.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import resolves.hw2.task2.enums.CpuEnum;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class Ultrabook extends Laptop {
    private double displayThickness;

    public Ultrabook(CpuEnum cpu, int price, int ram, double display, double displayThickness) {
        super(cpu, price, ram, display);
        this.displayThickness = displayThickness;
    }
}
