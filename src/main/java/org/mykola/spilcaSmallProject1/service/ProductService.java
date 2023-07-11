package org.mykola.spilcaSmallProject1.service;

import org.mykola.spilcaSmallProject1.entity.Product;
import org.mykola.spilcaSmallProject1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product>findAll(){
        return productRepository.findAll();
    }
}
