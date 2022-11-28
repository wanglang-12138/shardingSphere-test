package com.wl.shardingsphere;

import com.wl.shardingsphere.domain.Order;
import com.wl.shardingsphere.domain.User;
import com.wl.shardingsphere.repository.OrderRepository;
import com.wl.shardingsphere.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Autowired
    OrderRepository orderRepository;

    @Test
    void contextLoads() {

        for (int i = 0; i < 50; i++) {

            List<User> userList = new ArrayList<>();
            List<Order> orderList = new ArrayList<>();

            User user1 = new User();
            user1.setUsername("user" + i);
            user1.setPassword("password1");

            Order order1 = new Order();
            order1.setOrderName("order" + i);
            order1.setUser(user1);

            userList.add(user1);
            orderList.add(order1);

            User user2 = new User();
            user2.setUsername("user" + i);
            user2.setPassword("password2");

            Order order2 = new Order();
            order2.setOrderName("order" + i);
            order2.setUser(user2);

            userList.add(user2);
            orderList.add(order2);

            userRepository.saveAll(userList);
            orderRepository.saveAll(orderList);

        }
    }

}
