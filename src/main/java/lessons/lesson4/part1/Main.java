package lessons.lesson4.part1;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> strings1 = new ArrayList<>(100000);
//        strings1.add("adssad1"); //0
//        strings1.add("adssad1"); // 1
//        strings1.add("adssad2"); // 2
//        strings1.add("adssad3"); // 3
//
//        strings1.add("adssad5"); // 5
//        strings1.set(1,"adssad3");

//        System.out.println(strings1);
//
//        ArrayList<String> strings2 = new ArrayList<>();
//        strings2.add("2adssad1");
//        strings2.add("2adssad1");
//        strings2.add("2adssad2");
//        strings2.add("2adssad3");
//        strings2.add("2adssad4");
//        strings2.add("2adssad5");
//
//        strings1.addAll(strings2);
//
//        System.out.println(strings1);
//
//
//        ArrayList<String> strings3 = new ArrayList<>();
//        strings3.add("adssad5");
//        strings3.add("adssad1");
//        strings3.add("adssad1");
//        strings3.add("adssad3");
//        strings3.add("adssad2");
//        strings3.add("adssad4");
//
//        strings1.removeAll(strings3);
//        System.out.println(strings1);

//        strings1.get(0);
//        strings1.remove(4);
//        strings1.get(5);

//        strings1.forEach(s -> System.out.println(s));
//        System.out.println(strings1.indexOf("aaaa"));
////        int newCapacity = (oldCapacity * 3)/2 + 1;
//        strings1.removeIf(s -> s.equals("adssad1"));
//        System.out.println(strings1);


//        for (String s : strings1) {
//            strings1.remove(s);
//        }

//        Iterator<String> iterator = strings1.iterator();
//
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            System.out.println(next);
//            if (next.equals("adssad3")) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(strings1);


//        strings1.sort((s, t1) -> s.compareTo(t1));
//        System.out.println(strings1);

//        ArrayList<String> strings1 = new ArrayList<>(100000);
        LinkedList<String> strings1 = new LinkedList<>();
        strings1.add("adssadasd ad 1"); //
        strings1.add("adssadasd ad 1"); //
        strings1.add("adsa sdas das sad1"); //
        strings1.add("adssasdaaaaa ssd asd aad2"); //
        strings1.add("adqwe qe13 2ssad3"); //
        strings1.add("adssad5"); //


        strings1.get(3);

        List<Integer> collect = strings1.stream()
                .distinct()
                .map(s -> s.length())
//                .filter(integer -> integer % 2 == 0)
                .sorted((t1, t2) -> t1 - t2)
                .collect(Collectors.toList());
        System.out.println(collect);

        boolean b = collect.stream().anyMatch(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        });

//        Integer integer = collect.stream()
//                .peek(integer1 -> {
//                    System.out.println(integer1);
//                })
//                .min((t1, t2) -> t1 - t2)
////                .orElse(100500);
//                .orElseGet(() -> {
//                    return 100500;
//                });


    }
}
