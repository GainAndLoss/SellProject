package com.example.sell.service.impl;

import com.example.sell.dataObject.ProductInfo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl serviceImpl;

    @Test
    public void findOne() {
        ProductInfo productInfo = serviceImpl.findById("101");
        Assert.assertNotNull(productInfo);
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfos = serviceImpl.findUpAll();
        Assert.assertNotEquals(0,productInfos.size());
        System.out.println(productInfos.get(0).getProductName());
    }

    @Test
    public void findAll() {
        Page<ProductInfo> page = serviceImpl.findAll(PageRequest.of(0,2));
        Assert.assertNotEquals(0,page.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setCategoryType(0);
        productInfo.setProductIcon("./");
        productInfo.setProductId("101");
        productInfo.setProductName("Test items");
        productInfo.setProductPrice(new BigDecimal(49.00));
        productInfo.setProductStock(99);
        productInfo.setProductStatus(0);

        ProductInfo productInfo1 = serviceImpl.save(productInfo);
        Assert.assertNotNull(productInfo);
    }
}