package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ClientPortfolio {

    @Id
    @GeneratedValue()
    private long ClientPortfolioId;

    @OneToMany(mappedBy = "portfolios", cascade = CascadeType.ALL)
    private List<Security> securities;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id") // The foreign key column in the Address table
    private Client clients;


}
