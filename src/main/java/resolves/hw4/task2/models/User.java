package resolves.hw4.task2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import resolves.hw4.task2.enums.Gender;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Comparable<User> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skills;
    private Car car;

    public User(int id, String name, String surname, String email, int age, Gender gender, List<Skill> skills, String model, int year, int power) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = new Car(model, year, power);
    }

    @Override
    public int compareTo(User o) {
        int i = this.skills.size() - o.getSkills().size();
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
