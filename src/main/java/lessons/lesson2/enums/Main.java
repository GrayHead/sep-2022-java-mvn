package lessons.lesson2.enums;

public class Main {
    public static void main(String[] args) {

        User user = new User(1, "kokos", Gender.MALE);
        System.out.println(user);
        Gender gender = user.getGender();
        System.out.println(gender.ordinal());
        System.out.println(gender.name());
        System.out.println(gender.isYchor());
    }
}

