package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String orderNumber;

    public Order() {
    }

    public Order(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
