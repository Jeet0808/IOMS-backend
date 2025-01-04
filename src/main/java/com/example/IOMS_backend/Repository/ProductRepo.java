package com.example.IOMS_backend.Repository;

import com.example.IOMS_backend.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {



}
