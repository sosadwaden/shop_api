package com.sosadwaden.shop_api.service;

import com.sosadwaden.shop_api.entity.dao.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(int id);

    Product save(Product product);

    void deleteById(int id);
}
