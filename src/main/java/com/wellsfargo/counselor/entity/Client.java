package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long ClientId;

    @ManyToOne
    @JoinColumn(name = "fa_id") // The name of the foreign key column in the Product table
    private Financial_Advisor financial_advisor;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ClientPortfolio clientportfolio;

    @Column(nullable = false)
    private String ClientName;

    protected Client() {
    }

    public Long getClientId() {
        return ClientId;
    }

    public Client(String ClientName) {
        this.ClientName = ClientName;
    }

    public String getClientName(String ClientName) {
        return ClientName;
    }

    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }
}

