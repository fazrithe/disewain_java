package com.sewa.disewain.service;

import com.sewa.disewain.common.ResponseUtil;
import com.sewa.disewain.constan.MessageConstant;
import com.sewa.disewain.form.ProductCategoryForm;
import com.sewa.disewain.model.ProductCategoryModel;
import com.sewa.disewain.repository.ProductCategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductCategorySvcImpl implements ProductCategorySvc {
    private final ProductCategoryRepository productCategoryRepository;

    public ProductCategorySvcImpl(ProductCategoryRepository productCategoryRepository) {
        this.productCategoryRepository = productCategoryRepository;
    }

    @Override
    public ResponseEntity<Object> create(ProductCategoryForm form) {
        try {
            ProductCategoryModel product = productCategory(form);
            productCategoryRepository.save(product);
            return ResponseUtil.build(MessageConstant.SUCCESS, product, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseUtil.build(e.getMessage(), null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Object> getAll() {
        try {
            List<ProductCategoryModel> products = productCategoryRepository.findAll();
            return ResponseUtil.build(MessageConstant.SUCCESS, products, HttpStatus.OK);
        } catch (Exception e) {
            return ResponseUtil.build(e.getMessage(), null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Object> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Object> updateById(ProductCategoryForm form, Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Object> deleteById(Long id) {
        return null;
    }

    private ProductCategoryModel productCategory(ProductCategoryForm form) {
        ProductCategoryModel productCategory = new ProductCategoryModel();
        productCategory.setProductCategoryName(form.getProductCategoryName());
        return productCategory;
    }
}
