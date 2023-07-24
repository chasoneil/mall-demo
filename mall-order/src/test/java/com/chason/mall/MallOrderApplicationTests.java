package com.chason.mall;

import com.chason.mall.order.entity.OrderEntity;
import com.chason.mall.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class MallOrderApplicationTests {

    @Autowired
    private OrderService orderService;

    @Test
    void contextLoads() {

        OrderEntity order = new OrderEntity();
        order.setCreateTime(new Date());
        orderService.save(order);

    }

}
