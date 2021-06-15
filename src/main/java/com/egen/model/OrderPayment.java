package com.egen.model;

import com.egen.model.enums.PaymentType;
import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
public class OrderPayment {

    @Id
    @Column(name = "order_payment_id")
    private String id;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_payment_method")
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @Column(name = "order_payment_date")
    private ZonedDateTime paymentDate;

    @Column(name = "order_payment_confirmation_number")
    private String paymentConfirmationNumber;

    @Column(name = "order_amount")
    private double orderAmount;

    @Column(name = "order_shipping_charges")
    private double shippingCharges;

    public OrderPayment(){
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

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public ZonedDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(ZonedDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentConfirmationNumber() {
        return paymentConfirmationNumber;
    }

    public void setPaymentConfirmationNumber(String paymentConfirmationNumber) {
        this.paymentConfirmationNumber = paymentConfirmationNumber;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public double getShippingCharges() {
        return shippingCharges;
    }

    public void setShippingCharges(double shippingCharges) {
        this.shippingCharges = shippingCharges;
    }
}
