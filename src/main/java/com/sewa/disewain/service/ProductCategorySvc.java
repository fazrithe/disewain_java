package com.sewa.disewain.service;

import com.sewa.disewain.form.ProductCategoryForm;
import org.springframework.http.ResponseEntity;

public interface ProductCategorySvc {

    ResponseEntity<Object> create(ProductCategoryForm form);

    ResponseEntity<Object> getAll();

    ResponseEntity<Object> findById(Long id);

    ResponseEntity<Object> updateById(ProductCategoryForm form, Long id);

    ResponseEntity<Object> deleteById(Long id);
}
