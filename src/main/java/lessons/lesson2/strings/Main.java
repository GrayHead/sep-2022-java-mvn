package lessons.lesson2.strings;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s1 = "asd";
        String s2 = "asd";
        System.out.println(s1 == s2); // true

        String s3 = new String("foo");
        String s4 = new String("foo");
        System.out.println(s3 == s4);

        char[] chars = s4.toCharArray();

        System.out.println(Arrays.toString(s4.getBytes(StandardCharsets.UTF_8)));


    }
}
