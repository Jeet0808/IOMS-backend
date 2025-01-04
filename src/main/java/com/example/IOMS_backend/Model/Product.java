package com.example.IOMS_backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String ProductName;
    private String ProductId;
    private double ProductPrice ;
    private String Productcategory = "General";
    private String Productsellername;
    private String SellerShopeName;
    private String SellerEmail;
    private String ProductDiscription;
    private String ProductDetails;
    private String ProductImgUrl;

    public Product(){};



    public Product(Long id, String productId, String productName, double productPrice, String productcategory, String productsellername, String sellerShopeName, String sellerEmail, String productDiscription, String productDetails ,String productimgurl) {
        Id = id;
        ProductId = productId;
        ProductName = productName;
        ProductPrice = productPrice;

        Productcategory = productcategory;
        Productsellername = productsellername;
        SellerShopeName = sellerShopeName;
        SellerEmail = sellerEmail;
        ProductDiscription = productDiscription;
        ProductDetails = productDetails;
        ProductImgUrl = productimgurl;
    }

    public String getProductImgUrl() {
        return ProductImgUrl;
    }

    public void setProductImgUrl(String productImgUrl) {
        ProductImgUrl = productImgUrl;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }

    public String getProductcategory() {
        return Productcategory;
    }

    public void setProductcategory(String productcategory) {
        Productcategory = productcategory;
    }

    public String getProductsellername() {
        return Productsellername;
    }

    public void setProductsellername(String productsellername) {
        Productsellername = productsellername;
    }

    public String getSellerShopeName() {
        return SellerShopeName;
    }

    public void setSellerShopeName(String sellerShopeName) {
        SellerShopeName = sellerShopeName;
    }

    public String getSellerEmail() {
        return SellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        SellerEmail = sellerEmail;
    }

    public String getProductDiscription() {
        return ProductDiscription;
    }

    public void setProductDiscription(String productDiscription) {
        ProductDiscription = productDiscription;
    }

    public String getProductDetails() {
        return ProductDetails;
    }

    public void setProductDetails(String productDetails) {
        ProductDetails = productDetails;
    }

    @Override
    public String toString(){
        return "Product{" +
                 "id=" +Id +
                ",ProductId='" + ProductId + '\'' +
                ",ProductName='" + ProductName + '\'' +
                ",Price='"+ ProductPrice +'\'' +
                ",Productcategory='" + Productcategory + '\'' +
                ",Productsellername='" + Productsellername + '\'' +
                ",SellerShopeName='" + SellerShopeName + '\'' +
                ",SellerEmail='" + SellerEmail + '\'' +
                ",ProductDiscription='" + ProductDiscription + '\'' +
                ",ProductDetails='" + ProductDetails + '\'' +
                ",ProductImgUrl='" + ProductImgUrl + '\'' +
                '}';


    }
}
