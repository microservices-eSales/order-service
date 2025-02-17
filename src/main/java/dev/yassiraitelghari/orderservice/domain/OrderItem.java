package dev.yassiraitelghari.orderservice.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    private UUID product_id ;
    private int quantity ;
    private double price ;
}
