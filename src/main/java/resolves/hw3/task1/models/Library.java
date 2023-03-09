package resolves.hw3.task1.models;

import resolves.hw3.task1.interfaces.Printable;

import java.util.ArrayList;

public class Library {
    private static final ArrayList<Printable> library =new ArrayList<>();

    public static void add(Printable item){
        library.add(item);
    }

    public static void showBooks(){
        for (Printable item : library) {
            if (item instanceof Book){
                item.print();
            }
        }
    }

    public static void showMagazines(){
        for (Printable item : library) {
            if (item instanceof Magazines){
                item.print();
            }
        }
    }
}
