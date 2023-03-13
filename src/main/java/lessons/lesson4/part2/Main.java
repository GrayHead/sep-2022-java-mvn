package lessons.lesson4.part2;

import lombok.*;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        HashSet<User> users = new HashSet<>();
//        LinkedHashSet<User> users = new LinkedHashSet<>();
        Set<User> users = new TreeSet<>();
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));
        System.out.println(users);

//        users.forEach(user -> System.out.println(user.hashCode()));

        users.stream().collect(Collectors.toSet());


    }
}


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
class User implements Comparable<User> {
    private int id;
    private String name;

    @Override
    public int compareTo(User user) {
        return this.id - user.id;
    }
}
