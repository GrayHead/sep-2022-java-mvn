package resolves.hw4.task1;

import resolves.hw4.task1.models.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Max", 15),
                new User("Olha", 20),
                new User("Karina", 17),
                new User("Marta", 21),
                new User("Kamila", 30)
        );

//        users.sort((o1, o2) -> o1.getAge()-o2.getAge());
        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println(users);
        users.sort((o1, o2) -> o2.getAge() - o1.getAge());
        System.out.println(users);
//        users.sort((o1, o2) -> o1.getName().length()-o2.getName().length());
        users.sort(Comparator.comparingInt(o -> o.getName().length()));
        System.out.println(users);
        users.sort((o1, o2) -> o2.getName().length() - o1.getName().length());
        System.out.println(users);
        List<String> strings = Arrays.asList("dog", "cat", "horse", "apple", "pineapple");

        strings.sort((o1, o2) -> o1.compareTo(o2));
        strings.sort(String::compareTo);
        System.out.println(strings);
    }
}
