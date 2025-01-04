package com.example.IOMS_backend.Service;

import com.example.IOMS_backend.Model.Product;
import com.example.IOMS_backend.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public ResponseEntity<String> AddProduct(Product product){
        // Now firstly check details before Adding
        if (product.getProductPrice() <0){
            return new ResponseEntity<>("Price Should Be positive"+product.getProductPrice(),HttpStatus.BAD_REQUEST);
        }

        product.setProductId(getproid());
        productRepo.save(product);
        return new ResponseEntity<>("Product Saved : "+product.getProductName()+" At Category : "+product.getProductcategory(),HttpStatus.OK);

    }

    public String getproid() {
        return "IOMS"+ (int) Math.floor(Math.random()*10000);
    }
//sd
    public List<Product> GetProduct() {
        return productRepo.findAll();
    }

    public Product PutProduct(Product product) {
        return productRepo.save(product);
    }

    public void DeleteProduct(String productid) {
        for (Product p : productRepo.findAll()) {
            if (p.getProductId()==productid){
                productRepo.delete(p);




                // addonebhg
            }

        }
    }
}
