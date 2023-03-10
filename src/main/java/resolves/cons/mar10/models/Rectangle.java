package resolves.cons.mar10.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Rectangle extends Shape{
    private int a;
    private int b;

    @Override
    public void perimeter() {
        System.out.println((this.a + this.b) * 2);
    }

    @Override
    public void area() {
        System.out.println(this.a * this.b);
    }
}
