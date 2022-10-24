package com.sewa.disewain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity()
@Table(name = "products")
@NoArgsConstructor
@Where(clause = "is_deleted = false")
public class ProductModel extends BaseDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @OneToOne
    @JoinColumn(name = "category_product_id")
    private ProductModel productModel;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "price", nullable = false)
    private Double productPrice;

    public void setProductModel(Long productCateogryModel) {
    }

    public void getProductPrice(Double productPrice) {
    }
}
