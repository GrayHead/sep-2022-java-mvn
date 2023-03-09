package resolves.hw3.tast2;

import resolves.hw3.tast2.interfaces.Instrument;
import resolves.hw3.tast2.models.Drum;
import resolves.hw3.tast2.models.Guitar;
import resolves.hw3.tast2.models.Trumpet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Instrument> instruments = Arrays.asList(
                new Trumpet(25.6),
                new Drum(30),
                new Guitar(6)
        );

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
