package com.example.IOMS_backend.Repository;
import com.example.IOMS_backend.Model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepo extends JpaRepository<Seller,Long> {
}
