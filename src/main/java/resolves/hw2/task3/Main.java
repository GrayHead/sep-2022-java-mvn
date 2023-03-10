package resolves.hw2.task3;



import resolves.hw2.task3.enums.Gender;
import resolves.hw2.task3.models.Skill;
import resolves.hw2.task3.models.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = new User(
                1,
                "Max",
                "Popov",
                "popov@gmail.com",
                18,
                Gender.MALE,
                new ArrayList<>(),
                "Kia",
                2008,
                600
        );
        ArrayList<Skill> skills = user.getSkills();

        skills.add(new Skill("java", 10));
        skills.add(new Skill("js", 5));
        skills.add(new Skill("python", 10));

        System.out.println(user);


    }


}
