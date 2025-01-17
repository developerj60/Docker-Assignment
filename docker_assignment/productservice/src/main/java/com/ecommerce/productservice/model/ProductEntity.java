package com.ecommerce.productservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@Data
@NoArgsConstructor
@Document(collection = "product")
public class ProductEntity implements Serializable {
    @Id
    private Long id;
    private String name;
    private String size;
    private Double price;
    private String design;
}
