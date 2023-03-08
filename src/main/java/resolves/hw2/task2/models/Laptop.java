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
public class Laptop extends PC {
    private double display;

    public Laptop(CpuEnum cpu, int price, int ram, double display) {
        super(cpu, price, ram);
        this.display = display;
    }
}
