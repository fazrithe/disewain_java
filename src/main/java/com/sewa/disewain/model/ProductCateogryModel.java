package com.sewa.disewain.model;


import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity()
@Table(name = "product_categories")
@NoArgsConstructor
public class ProductCateogryModel extends BaseDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "product_name", nullable = false)
    private String productName;

}
