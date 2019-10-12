package com.example.sell.repository;

import com.example.sell.dataObject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepostoryTest {
    @Autowired
    private  OrderDetailRepostory orderDetailRepostory;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1234567");
        orderDetail.setOrderId("122");
        orderDetail.setProductIcon("http://a.jpg");
        orderDetail.setProductId("1000000000");
        orderDetail.setProductName("西红柿");
        orderDetail.setProductPrice(new BigDecimal(2.2));
        orderDetail.setProductQuantity(5);

        OrderDetail result = orderDetailRepostory.save(orderDetail);
        Assert.assertNotNull(result);
    }
}