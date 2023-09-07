package com.programmingtechie.productservice.repository;

import com.programmingtechie.productservice.model.Product;


public interface ProductRepository extends MongoRepository<Product, String> {
}
