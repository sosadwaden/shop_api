package com.sosadwaden.shop_api.controller;

import com.sosadwaden.shop_api.entity.dao.Product;
import com.sosadwaden.shop_api.service.ProductService;
import com.sosadwaden.shop_api.service.impl.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable int id) {
        return productService.findById(id);
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        Product newProduct = productService.save(product);
        return newProduct;
    }

    @PutMapping
    public Product update(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id) {
        productService.deleteById(id);
        return "Product with id = " + id + " was deleted";
    }
}
