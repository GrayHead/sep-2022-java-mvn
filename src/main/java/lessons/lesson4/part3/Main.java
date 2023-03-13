package lessons.lesson4.part3;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        HashMap<Integer, Friend> friendMap = new HashMap<>();
        friendMap.put(1, new Friend("roman", 31));
        friendMap.put(2, new Friend("taras", 33));
        friendMap.put(3, new Friend("ivan", 32));
        System.out.println(friendMap);

//        Friend friend = friendMap.get(2);
//        friendMap.containsKey(2);
//        friendMap.remove(2);
//        friendMap.replace(2, new Friend());
//        Set<Integer> integers = friendMap.keySet();
//        Collection<Friend> values = friendMap.values();
//        System.out.println(values);

        Set<Entry<Integer, Friend>> entries = friendMap.entrySet();
        Iterator<Entry<Integer, Friend>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Entry<Integer, Friend> next = iterator.next();
            System.out.println(next);
            Friend value = next.getValue();
            if (value.getAge() % 2 == 0) {
                iterator.remove();
            }
        }


        System.out.println(friendMap);
    }
}
