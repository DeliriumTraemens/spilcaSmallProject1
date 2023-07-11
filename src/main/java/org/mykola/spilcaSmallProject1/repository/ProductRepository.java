package org.mykola.spilcaSmallProject1.repository;

import org.mykola.spilcaSmallProject1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
