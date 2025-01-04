package com.example.IOMS_backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.security.PrivateKey;
import java.security.PublicKey;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String CustomerName;
    private String CustomerEmail;
    private long CustomerMobileNo;
    private String CustomerCity;
    private double CustomerLattitude;
    private double CustomerLongittude;


    public Customer(String customerName, String customerEmail, long customerMobileNo, String customerCity, double customerLattitude, double customerLongittude) {
        CustomerName = customerName;
        CustomerEmail = customerEmail;
        CustomerMobileNo = customerMobileNo;
        CustomerCity = customerCity;
        CustomerLattitude = customerLattitude;
        CustomerLongittude = customerLongittude;
    }

    public Customer() {
    }


    public Long getId(){
        return Id;
    }
    public void setId(Long id){
       Id = id;

    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public long getCustomerMobileNo() {
        return CustomerMobileNo;
    }

    public void setCustomerMobileNo(long customerMobileNo) {
        CustomerMobileNo = customerMobileNo;
    }

    public String getCustomerCity() {
        return CustomerCity;
    }

    public void setCustomerCity(String customerCity) {
        CustomerCity = customerCity;
    }

    public double getCustomerLattitude() {
        return CustomerLattitude;
    }

    public void setCustomerLattitude(double customerLattitude) {
        CustomerLattitude = customerLattitude;
    }

    public double getCustomerLongittude() {
        return CustomerLongittude;
    }

    public void setCustomerLongittude(double customerLongittude) {
        CustomerLongittude = customerLongittude;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + Id +
                "CustomerName='" + CustomerName + '\'' +
                ", CustomerEmail='" + CustomerEmail + '\'' +
                ", CustomerMobileNo=" + CustomerMobileNo +
                ", CustomerCity='" + CustomerCity + '\'' +
                ", CustomerLattitude=" + CustomerLattitude +
                ", CustomerLongittude=" + CustomerLongittude +
                '}';
    }
}
