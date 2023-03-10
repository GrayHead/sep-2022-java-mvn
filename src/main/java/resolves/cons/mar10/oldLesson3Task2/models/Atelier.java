package resolves.cons.mar10.oldLesson3Task2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import resolves.cons.mar10.oldLesson3Task2.interfaces.Man;
import resolves.cons.mar10.oldLesson3Task2.interfaces.Woman;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Atelier {
    private ArrayList<Clothes> clothes;

    public Atelier() {
        this.clothes = new ArrayList<>();
    }

    public void addClothes(Clothes item) {
        this.clothes.add(item);
    }

    public ArrayList<Man> getManClothes() {
        ArrayList<Man> menArray = new ArrayList<>();

        for (Clothes clothe : this.clothes) {
            if (clothe instanceof Man) {
                Man mClothes = (Man) clothe;
                mClothes.DressMan();
                menArray.add(mClothes);
            }
        }
        return menArray;
    }

    public ArrayList<Woman> getWomanClothes() {
        ArrayList<Woman> womanArrayList = new ArrayList<>();
        for (Clothes clothe : this.clothes) {
            if (clothe instanceof Woman) {
                Woman wClothes = (Woman) clothe;
                wClothes.dressWomen();
                womanArrayList.add(wClothes);
            }
        }
        return womanArrayList;
    }

}
