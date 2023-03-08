package resolves.hw2.task2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import resolves.hw2.task2.enums.CpuEnum;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PC {
    private CpuEnum cpu;
    private int price;
    private int ram;
}
