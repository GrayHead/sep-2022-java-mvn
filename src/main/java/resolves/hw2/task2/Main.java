package resolves.hw2.task2;

import lesson2.task2.enums.CpuEnum;
import lesson2.task2.models.Ultrabook;
import lesson2.task2.models.Workstation;

public class Main {
    public static void main(String[] args) {
        Ultrabook ultrabook = new Ultrabook(CpuEnum.INTEL, 1000, 12, 15.5, 2.5);
        Workstation workstation = new Workstation(CpuEnum.M1, 2500, 16, 14.2, 500);

        System.out.println(ultrabook);
        System.out.println(workstation);
    }
}
