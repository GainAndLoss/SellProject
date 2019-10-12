package com.example.sell.repository;

import com.example.sell.dataObject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

        List<ProductInfo> findByProductStatus(Integer productStatus);
}
