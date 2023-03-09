package resolves.hw3.tast2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import resolves.hw3.tast2.interfaces.Instrument;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guitar implements Instrument {
    private int countOfChord;
    @Override
    public void play() {
        System.out.println("Грає " + this.getClass().getSimpleName() + " і в неї " + this.countOfChord + " струни");
    }
}
