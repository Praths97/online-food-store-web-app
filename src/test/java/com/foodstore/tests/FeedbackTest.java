package com.foodstore.tests;

import com.foodstore.model.Feedback;
import com.foodstore.services.orders.OrderServiceImplementation;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class FeedbackTest {
    @Test
    public void checkFeedback(){
        Feedback feedback=new Feedback();
        feedback.setOrderId("123");
        feedback.setCustomerName("venkat");
        feedback.setMessage("tasty");

        OrderServiceImplementation orderServiceImplementation=new OrderServiceImplementation();
        String feedbackId=orderServiceImplementation.giveFeedback(feedback);
        assertNotNull(feedbackId);
    }
}
