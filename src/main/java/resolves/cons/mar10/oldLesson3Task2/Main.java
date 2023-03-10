package resolves.cons.mar10.oldLesson3Task2;

import resolves.cons.mar10.oldLesson3Task2.enums.Size;
import resolves.cons.mar10.oldLesson3Task2.models.*;

public class Main {
    public static void main(String[] args) {
        Atelier atelier1 = new Atelier();

        atelier1.addClothes(new TShort(Size.XXS, 100, "red"));
        atelier1.addClothes(new Trousers(Size.L, 200, "green"));
        atelier1.addClothes(new Tie(Size.M, 50, "green"));
        atelier1.addClothes(new Dress(Size.XXS, 600, "red"));

        System.out.println(atelier1.getManClothes());
        System.out.println("*******************");
        System.out.println(atelier1.getWomanClothes());
    }
}
