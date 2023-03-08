package lessons.lesson3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class User implements X, Y {
    private int id;
    private String name;

    public void greeting() {
        // ....
    }

    @Override
    public void scream(String whatToScream) {
        //......
    }
}
