package lessons.lesson2.exten;

public class Main {
    public static void main(String[] args) {


        Student student = new Student(
                "mem05",
                "vasya",
                123);
        System.out.println(student);
        student.fooHuman();

        foobar(new Human("petya",321)); // errro
        foobar(student); // work

        System.out.println(Student.ID);


    }

    public static void foobar(Human human) {
        //.....
//        Student student = (Student) human;
//        System.out.println(student.getGroup());

        System.out.println(human.getName());

    }
}
