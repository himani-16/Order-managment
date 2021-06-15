package com.egen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class OrderItems {

    @Id
    @Column(name = "order_item_id")
    private String itemId;

    @Column(name = "order_item_name")
    private String itemName;

    @Column(name = "order_quantity")
    private Integer itemQty;

    @Column(name = "order_tax")
    private double orderTax;

    @Column(name = "order_amount")
    private double amount;

    @Column(name = "order_total")
    private double total;

    public OrderItems(){
        this.itemId = UUID.randomUUID().toString();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemQty() {
        return itemQty;
    }

    public void setItemQty(Integer itemQty) {
        this.itemQty = itemQty;
    }

    public double getOrderTax() {
        return orderTax;
    }

    public void setOrderTax(double orderTax) {
        this.orderTax = orderTax;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
