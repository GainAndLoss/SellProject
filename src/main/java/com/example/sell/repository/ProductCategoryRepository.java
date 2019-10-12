package com.example.sell.repository;

import com.example.sell.dataObject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCategoryRepository extends JpaRepository< ProductCategory,Integer> {
    List<ProductCategory> findByCategroyTypeIn(List<Integer> productStatus);
}
