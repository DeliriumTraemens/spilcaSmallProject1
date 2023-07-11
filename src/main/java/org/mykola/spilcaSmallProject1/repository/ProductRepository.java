package org.mykola.spilcaSmallProject1.repository;

import org.mykola.spilcaSmallProject1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
