package com.sewa.disewain.model;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity()
@Table(name = "product_categories")
@NoArgsConstructor
@Where(clause = "is_deleted = false")
public class ProductCategoryModel extends BaseDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "category_name", nullable = false)
    private String productName;

    public void setProductCategoryName(String productCategoryName) {
    }
}
