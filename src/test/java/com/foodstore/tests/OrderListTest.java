package com.foodstore.tests;

import com.foodstore.model.Order;
import com.foodstore.services.orders.OrderServiceImplementation;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class OrderListTest {
    @Test
    public void checkOrderDetails(){
        OrderServiceImplementation orderServiceImplementation=new OrderServiceImplementation();
         List<Order> order=  orderServiceImplementation.listOrders();
        assertTrue(order.size()>=0);
    }
}
