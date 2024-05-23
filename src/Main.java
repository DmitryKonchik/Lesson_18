import java.util.ArrayList;

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

    }
}