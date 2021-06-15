package com.egen.model;

import com.egen.model.enums.OrderStatus;
import com.egen.model.enums.ShipmentType;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class OrderShipping {

    @Id
    @Column(name = "order_shipping_id")
    private String id;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_shipping_addressline1")
    private String shippingAddressLine1;

    @Column(name = "order_shipping_addressline2")
    private String shippingAddressLine2;

    @Column(name = "order_shipping_city")
    private String shippingCity;

    @Column(name = "order_shipping_state")
    private String shippingState;

    @Column(name = "order_shipping_zip")
    private String shippingZip;

    @Column(name = "order_status")
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @Column(name = "order_shipping_type")
    @Enumerated(EnumType.STRING)
    private ShipmentType shipmentType;

    public OrderShipping(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getShippingAddressLine1() {
        return shippingAddressLine1;
    }

    public void setShippingAddressLine1(String shippingAddressLine1) {
        this.shippingAddressLine1 = shippingAddressLine1;
    }

    public String getShippingAddressLine2() {
        return shippingAddressLine2;
    }

    public void setShippingAddressLine2(String shippingAddressLine2) {
        this.shippingAddressLine2 = shippingAddressLine2;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingZip() {
        return shippingZip;
    }

    public void setShippingZip(String shippingZip) {
        this.shippingZip = shippingZip;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public ShipmentType getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(ShipmentType shipmentType) {
        this.shipmentType = shipmentType;
    }
}
