import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        //Task first
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(i);
            list.add(i - 1);
        }

        list.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);


        //Hard Task

        Map<Integer, String> users = new HashMap<>();

        users.put(1, "Dima");
        users.put(2, "Den");
        users.put(3, "Jhon");
        users.put(5, "Bob");
        users.put(4, "Gabriel");
        users.put(8, "Gabriel1");
        users.put(13, "Dilan");
        users.put(11, "Stepan");

        List<StringBuilder> list2 = users.keySet().stream()
                .filter(u -> u == 1 || u == 2 || u == 5 || u == 8 || u == 9 || u == 13)
                .filter(u -> users.get(u).length() % 2 != 0)
                .map(u -> new StringBuilder(users.get(u)).reverse())
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}