package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Financial_Advisor {

    @Id
    @GeneratedValue()
    private long id;

    @OneToMany(mappedBy = "financial_advisor", cascade = CascadeType.ALL)
    private List<Client> clients;

    @Column(nullable = false)
    private String EmployeeName;

    @Column(nullable = false)
    private String EmployeeEmail;

    @Column(nullable = false)
    private String EmployeeAddress;

    protected Financial_Advisor() {

    }

    public Financial_Advisor(String EmployeeName, String EmployeeEmail, String EmployeeAddress) {
        this.EmployeeName = EmployeeName;
        this.EmployeeEmail = EmployeeEmail;
        this.EmployeeAddress = EmployeeAddress;
    }

    public Long getEmployeeId() {
        return id;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getEmployeeAddress() {
        return EmployeeAddress;
    }

    public void setEmployeeAddress(String EmployeeAddress) {
        this.EmployeeAddress = EmployeeAddress;
    }

    public String getEmployeeEmail() {
        return EmployeeEmail;
    }

    public void setEmployeeEmail(String EmployeeEmail) {
        this.EmployeeEmail = EmployeeEmail;
    }

}