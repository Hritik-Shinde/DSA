package StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class faltmap {

    class User {

        String name;

        String city;

        List<Order> orders;

        // getters and setters

    }

    class Order {

        Long id;

        double amount;

        // getters and setters

    }

//    List<Long> result = input.stream()
//            .filter(user -> "Bangalore".equals(user.getCity()))
//            .flatMap(user -> user.getOrders().stream())
//            .filter(order -> order.getAmount() > 2000)
//            .map(Order::getId)
//            .collect(Collectors.toList());
}
