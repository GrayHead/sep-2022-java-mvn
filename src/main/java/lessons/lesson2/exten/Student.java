package lessons.lesson2.exten;

class Student extends Human {
    private String group;

    public static final int ID = 1000;

    public Student() {
        super();
    }

    public Student(
            String group,
            String name,
            int age) {
        super(name, age);
        this.group = group;

    }

    public String getGroup() {
        return group;
    }

    public void setGroup(/*final*/ String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                "} " + super.toString();
    }

    public static void staticFoo() {
        System.out.println(ID);
    }

//    @Override
//    public void fooHuman() {
//        System.out.println("syident foo");
//    }
}
