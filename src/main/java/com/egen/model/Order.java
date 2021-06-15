package com.egen.model;

import com.egen.model.enums.OrderStatus;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Order {
    @Id
    @Column(name = "order_id")
    private  String id;

    @Column(name = "order_customer_id")
    private String customerId;

    @Column(name = "order_date")
    private ZonedDateTime orderDate;

    @Column(name = "order_creation_date")
    private ZonedDateTime orderCreationDate;

    @Column(name = "order_status")
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private List<OrderPayment> paymentList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItems> itemsList = new ArrayList<>();

    public Order(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ZonedDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(ZonedDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public ZonedDateTime getOrderCreationDate() {
        return orderCreationDate;
    }

    public void setOrderCreationDate(ZonedDateTime orderCreationDate) {
        this.orderCreationDate = orderCreationDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<OrderPayment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<OrderPayment> paymentList) {
        this.paymentList = paymentList;
    }

    public List<OrderItems> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<OrderItems> itemsList) {
        this.itemsList = itemsList;
    }
}
