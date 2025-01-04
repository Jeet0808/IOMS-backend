package com.example.IOMS_backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String SellerName;
    private String SellerLocation;
    private long SellerMobileNo;
    private String SellerEmail;
    private String SellerShopeName;


    public Seller(Long id, String sellerName, String sellerLocation, long sellerMobileNo, String sellerEmail, String sellerShopeName) {
        Id = id;
        SellerName = sellerName;
        SellerLocation = sellerLocation;
        SellerMobileNo = sellerMobileNo;
        SellerEmail = sellerEmail;
        SellerShopeName = sellerShopeName;
    }

    public Seller(){}

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getSellerName() {
        return SellerName;
    }

    public void setSellerName(String sellerName) {
        SellerName = sellerName;
    }

    public String getSellerLocation() {
        return SellerLocation;
    }

    public void setSellerLocation(String sellerLocation) {
        SellerLocation = sellerLocation;
    }

    public long getSellerMobileNo() {
        return SellerMobileNo;
    }

    public void setSellerMobileNo(long sellerMobileNo) {
        SellerMobileNo = sellerMobileNo;
    }

    public String getSellerEmail() {
        return SellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        SellerEmail = sellerEmail;
    }

    public String getSellerShopeName() {
        return SellerShopeName;
    }

    public void setSellerShopeName(String sellerShopeName) {
        SellerShopeName = sellerShopeName;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "Id=" + Id +
                ", SellerName='" + SellerName + '\'' +
                ", SellerLocation='" + SellerLocation + '\'' +
                ", SellerMobileNo='" + SellerMobileNo + '\'' +
                ", SellerEmail='" + SellerEmail + '\'' +
                ", SellerShopeName='" + SellerShopeName + '\'' +
                '}';
    }
}
