package com.example.sell.service.impl;

        import com.example.sell.dataObject.ProductCategory;
        import com.example.sell.service.CategoryService;
        import org.junit.Assert;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.test.context.junit4.SpringRunner;

        import java.util.Arrays;
        import java.util.List;

        import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl category;

    @Test
    public void findOne() {
        ProductCategory productCategory = category.findOne(1);
        Assert.assertEquals(1,productCategory.getCategroyId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategoryList = category.findAll();
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> productCategoryList = category.findByCategoryTypeIn(Arrays.asList(0,1));
        Assert.assertNotEquals(0,productCategoryList.size());
        System.out.println(productCategoryList.get(0).getCategroyName());
    }

    @Test
    public void save() {
        ProductCategory productCategory = category.save(new ProductCategory("just be happy ", 666));
        Assert.assertNotNull(productCategory);
    }

    @Test
    public void delete() {

    }
}