package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.awt.*;
import java.security.Security;

@Entity
public class Portfolio {


    @OneToMany
    private List security;
    @ManyToOne
    private Client client;

        @Id
        @GeneratedValue()
        private long portfolioId;

        @Column(nullable = false)
        private String dateCreated;


        protected Portfolio() {

        }

        public Portfolio(String dateCreated) {
            this.dateCreated = dateCreated;

        }

        public Long getPortfolioId() {
            return portfolioId;
        }

        public String getDate_Created() {
            return dateCreated;
        }

        public void setDateCreated(String dateCreated) {
            this.dateCreated = dateCreated;
        }


    }
