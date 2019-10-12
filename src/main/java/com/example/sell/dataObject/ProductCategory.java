package com.example.sell.dataObject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.text.DecimalFormat;

@Entity
@Table( name = "product_categroy")
@DynamicUpdate
@Data
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categroyId;
    private String categroyName;
    private int categroyType;

    public ProductCategory() {
    }

    public ProductCategory(String categroyName, int categroyType) {
        this.categroyName = categroyName;
        this.categroyType = categroyType;
    }

    public ProductCategory(int categoryId, String categroyName, int categroyType) {
        this.categroyId = categoryId;
        this.categroyName = categroyName;
        this.categroyType = categroyType;
    }
//    利用lombok中@Data可以不用getter、setter、toString
//    public int getCategroyId() {
//        return CategroyId;
//    }
//
//    public void setCategroyId(int categroyId) {
//        CategroyId = categroyId;
//    }
//
//    public String getCategroyName() {
//        return CategroyName;
//    }
//
//    public void setCategroyName(String categroyName) {
//        CategroyName = categroyName;
//    }
//
//    public DecimalFormat getCategroyType() {
//        return CategroyType;
//    }
//
//    public void setCategroyType(DecimalFormat categroyType) {
//        CategroyType = categroyType;
//    }

    @Override
    public String toString() {
        return "ProductId: "+getCategroyId()+",ProductName: "+getCategroyName()+",ProductPrice: "+getCategroyType();
    }
}
