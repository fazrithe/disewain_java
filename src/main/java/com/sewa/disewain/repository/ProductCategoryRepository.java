package com.sewa.disewain.repository;

import com.sewa.disewain.model.ProductCateogryModel;
import com.sewa.disewain.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCateogryModel, Long> {
}
