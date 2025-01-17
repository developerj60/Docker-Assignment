package com.ecommerce.productservice.repository;

import com.ecommerce.productservice.model.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, Long> {
}
