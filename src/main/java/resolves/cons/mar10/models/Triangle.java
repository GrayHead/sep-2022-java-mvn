package resolves.cons.mar10.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Triangle extends Shape{
    private int a;
    private int b;

    private int c;

    @Override
    public void perimeter() {
        System.out.println(this.a + this.b + this.c);
    }

    @Override
    public void area() {
        System.out.println(this.a * 2 * this.b + this.c);
    }
}
