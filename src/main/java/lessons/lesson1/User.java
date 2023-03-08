package lessons.lesson1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private int age;
    private boolean status;
    private double weight;

    //    String[] skills;
    private ArrayList<String> skills;

}
