package com.order.orderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    private int orderId;
    private int orderAmt;
    private int qty;
    private int custId;
    private int productId;

}
