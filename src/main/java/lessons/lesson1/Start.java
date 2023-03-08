package lessons.lesson1;

import java.util.ArrayList;

public class Start {
    //    psvm
    public static void main(String[] args) {
//        sout
        System.out.println("its alive");

//        User userInstance = new User();
//        userInstance.name = "vasya";
//        userInstance.age = 31;
//        userInstance.status = true;
//        userInstance.weight = 123.4;

//        User userInstance = new User("kokos", 123, true, 12.2);
//        System.out.println(userInstance);
//        userInstance.setName("kokosina");
//        System.out.println(userInstance.getName());

        String[] skills = new String[3];
        skills[0] = "java";
        skills[1] = "js";
        skills[2] = "html";

//        for (int i = 0; i < skills.length; i++) {
//            String skill = skills[i];
//        }

//        for (String skill : skills) {
//
//        }


//        String[] skills = {"java", "js", "html"};
//        User userInstance = new User(
//                "kokos",
//                123,
//                true,
//                12.2,
//                new String[]{"java", "js", "html"}
//        );
//        System.out.println(userInstance);

        ArrayList<String> userSkills = new <String>ArrayList();
        userSkills.add("java");
        userSkills.add("js");
        userSkills.add("mysql");

        System.out.println(userSkills);

//        User userInstance = new User(
//                "kokos",
//                123,
//                true,
//                12.2,
//                userSkills
//        );


    }
}
