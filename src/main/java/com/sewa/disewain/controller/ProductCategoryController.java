package com.sewa.disewain.controller;

import com.sewa.disewain.form.ProductCategoryForm;
import com.sewa.disewain.service.ProductCategorySvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/category-product")
public class ProductCategoryController {
    private final ProductCategorySvc productCategorySvc;
    @Autowired
    public ProductCategoryController(ProductCategorySvc productCategorySvc) {
        this.productCategorySvc = productCategorySvc;
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody ProductCategoryForm form) {
        return productCategorySvc.create(form);
    }

    @GetMapping
    public ResponseEntity<Object> getAll() {
        return productCategorySvc.getAll();
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Object> getById(@PathVariable Long id) {

        return productCategorySvc.findById(id);
    }

    @PostMapping(value = "{id}")
    public ResponseEntity<Object> update(@RequestBody ProductCategoryForm form, @PathVariable Long id) {
        return productCategorySvc.updateById(form, id);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) {

        return productCategorySvc.deleteById(id);
    }

}
