package com.example.IOMS_backend.Controller;

import com.example.IOMS_backend.Model.Product;
import com.example.IOMS_backend.Service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductCtr {

    @Autowired
    private ProductService productService;

    @Operation(
            summary = "Add a product by Product data,",
            description = "Add a product with validation in addproduct methode "
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Product added successfully"),
            @ApiResponse(responseCode = "404", description = "invalid or client side mistakes")
    })

    @PostMapping("/add")
    public ResponseEntity<String> addproduct(@RequestBody Product product){
        return productService.AddProduct(product);
    }
    @GetMapping("/get")
    public List<Product> getallproduct(){
        return productService.GetProduct();
    }
    @PutMapping("/put")
    public Product putproduct(@RequestBody Product product){
        return productService.PutProduct(product);
    }
    @DeleteMapping("/delete")
    public  ResponseEntity<String> deleteproduct(@RequestParam String productid){
        productService.DeleteProduct(productid);
        return new ResponseEntity<>("Product Deleted succesfully", HttpStatus.OK);
    }
}
