package resolves.hw4.task2;


import resolves.hw4.task2.enums.Gender;
import resolves.hw4.task2.models.Skill;
import resolves.hw4.task2.models.User;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(
                1,
                "Max",
                "Popov",
                "popov@gmail.com",
                18,
                Gender.MALE,
                Arrays.asList(
                        new Skill("Python", 9),
                        new Skill("Js", 7)
                ),
                "Kia",
                2008,
                600
        );
        User user2 = new User(
                2,
                "Max",
                "Popov",
                "popov@gmail.com",
                18,
                Gender.MALE,
                Arrays.asList(
                        new Skill("Java", 10),
                        new Skill("Js", 7)
                ),
                "Kia",
                2008,
                600
        );
        User user3 = new User(
                3,
                "Max",
                "Popov",
                "popov@gmail.com",
                18,
                Gender.FEMALE,
                Arrays.asList(
                        new Skill("Js", 7)
                ),
                "Kia",
                2008,
                600
        );

        List<User> users1 = Arrays.asList(user1, user2, user3);
        HashSet<User> users = new HashSet<>(users1);
        users.removeIf(user -> user.getGender() == Gender.MALE);
        System.out.println(users);

        TreeSet<User> users2 = new TreeSet<>(users1);
        System.out.println(users2);
    }
}
