package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long SecurityId;

    @ManyToOne
    @JoinColumn(name = "clientportfolio_id") // The name of the foreign key column in the Product table
    private ClientPortfolio portfolios;

    @Column(nullable = false)
    private String SecurityName;

    @Column(nullable = false)
    private String Category;

    @Column(nullable = false)
    private int PurchasePrice;

    @Column(nullable = false)
    private LocalDate PurchaseDate;


    protected Security() {

    }

    public Security(String SecurityName, String Category, int PurchasePrice, LocalDate PurchaseDate) {
        this.SecurityName = SecurityName;
        this.Category = Category;
        this.PurchasePrice = PurchasePrice;
        this.PurchaseDate = PurchaseDate;
    }

    public Long getSecurityId() {
        return SecurityId;
    }

    public String getSecurityName() {
        return SecurityName;
    }

    public void setSecurityName(String SecurityName) {
        this.SecurityName = SecurityName;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(int PurchasePrice) {
        this.PurchasePrice = PurchasePrice;
    }

    public LocalDate getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(LocalDate PurchaseDate) {
        this.PurchaseDate = PurchaseDate;
    }

}