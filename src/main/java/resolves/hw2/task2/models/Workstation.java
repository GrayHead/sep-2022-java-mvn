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
public class Workstation extends Laptop {
    private int power;

    public Workstation(CpuEnum cpu, int price, int ram, double display, int power) {
        super(cpu, price, ram, display);
        this.power = power;
    }
}
