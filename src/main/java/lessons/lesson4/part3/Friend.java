package lessons.lesson4.part3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Friend {
    private String name;
    private int age;
}


class Entry <K,V>{
    K k;
    V v;
}
