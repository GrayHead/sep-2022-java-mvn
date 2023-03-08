package lessons.lesson2.abstraction;

public class Main {
    public static void main(String[] args) {


        Animal animal = new Animal() {
            @Override
            public void scream() {
                //.....3
                System.out.println("aaaaaaaaaaaaaaaaa");
            }
        };

        animal.scream();//aaaaaaaaaaaaaaaa

        Horse horse = new Horse(123, true, "sivka");

    }
}



