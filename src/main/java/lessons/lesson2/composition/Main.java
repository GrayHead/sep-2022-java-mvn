package lessons.lesson2.composition;

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(4, 400, "t400");

        Tractor tractor = new Tractor("aaa", engine);
        System.out.println(tractor);
        System.out.println(tractor.getEngine().getMark()); // t400
//        Truck truck = new Truck("volvo", 3, new Engine(5, 500, "t500"));
        Tractor bbb = new Tractor("bbb", 6, 600, "t600");


    }
}
