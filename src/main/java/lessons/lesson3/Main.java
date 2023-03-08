package lessons.lesson3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("okten");
        X.foo();
        System.out.println(X.ID);

        ArrayList<X> xList = new ArrayList<>();
        xList.add(new User());
        xList.add(new Student());
        for (X x : xList) {
            x.greeting();
            x.bar();
        }


        ArrayList<Y> yList = new ArrayList<Y>();
        yList.add(new User());
        yList.add(new Policeman());
        for (Y y : yList) {
            y.scream("asdasd");
        }
        X x1 = new X() {
            @Override
            public void greeting() {
                System.out.println("asjgdjasgd");
            }

        };

        x1.greeting();

        X x2 = new X() {
            @Override
            public void greeting() {
                ///........
            }
        };


        foobar(new X() {
            @Override
            public void greeting() {

            }
        });

        /*lmds*/


        Y y1 = s -> System.out.println(s + "!!!!!");
        y1.scream("aaaaa"); // aaaa!!!!!



//        barfoo(y1);
//        barfoo(whatToScream -> System.out.println("ashdfhasdfh"));


    }


    public static void foobar(X x) {
        //....

    }


    public static void barfoo(Y y) {
        //....

    }

}






