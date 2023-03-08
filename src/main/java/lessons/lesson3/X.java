package lessons.lesson3;

interface X {
    /*public static  final*/ int ID = 1000;

    void greeting();

    static String foo() {
        return "foo";
    }

    default void bar() {
        //....
    }
}
