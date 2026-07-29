package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

    static void main(String[] args) {
        List<User> list = Arrays.asList(
                new User("A",  3600, "IT"),
                new User("Sa", 4000, "IT"),
                new User("Baaa", 3000, "HR"),
                new User("Daa", 3500, "EOD")
        );

        List<User> list1 = list.stream().sorted(Comparator.comparing(User::getSalary)).toList();
//        System.out.println(list1);
        double v = list.stream().mapToDouble(User::getSalary).average().orElse(0);
//        System.out.println(v);
        Map<Boolean, List<User>> collect = list.stream().collect(Collectors.partitioningBy(user -> user.getSalary() > 3500));
//        System.out.println(collect.get(true));

    }
}
