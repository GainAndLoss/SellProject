package com.example.sell.repository;

import com.example.sell.dataObject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired(required = true)
    private ProductCategoryRepository categoryRepository;

    @Test
    public void sendOne(){
        ProductCategory category = categoryRepository.findById(1).orElse(null);
        if(category == null )
        System.out.println("无查询结果");
        else  System.out.println(category.toString());
    }

    @Test
    public void saveCategory(){
        ProductCategory category = new ProductCategory(1,"我喜欢的",21);
        Assert.assertNotNull( categoryRepository.save( category));
    }
}