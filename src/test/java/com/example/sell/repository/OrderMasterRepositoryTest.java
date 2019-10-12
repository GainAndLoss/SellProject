package com.example.sell.repository;

import com.example.sell.dataObject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.beans.Transient;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
    @Autowired
    private  OrderMasterRepository orderMasterRepository;

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        /*这个地方调测数据支持中文,已调试，注意库，实例，表和列的存储类型*/
        orderMaster.setBuyerAddress("北京");
        orderMaster.setBuyerName("蔬菜");
        orderMaster.setBuyerOpenid("10002");
        orderMaster.setBuyerPhone("13520160042");
        orderMaster.setOrderId("122");
        orderMaster.setOrderAmount(new BigDecimal(5.00f));

        OrderMaster orderMasterResult = orderMasterRepository.save(orderMaster);
        Assert.assertNotNull(orderMasterResult);
    }

    @Test
    @Transient
    public void findByBuyerOpenid(){
        PageRequest pageRequest = PageRequest.of(0,3);

        Page<OrderMaster> result = orderMasterRepository.findByBuyerOpenid("10001",pageRequest);
        Assert.assertNotEquals(0,result.getTotalElements());

    }
}