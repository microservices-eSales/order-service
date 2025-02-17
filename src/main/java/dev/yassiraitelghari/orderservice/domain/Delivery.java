package dev.yassiraitelghari.orderservice.domain;

import dev.yassiraitelghari.orderservice.domain.enums.DeliveryStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "deliveries")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id ;

    private int trackingNumber;

    private DeliveryStatus deliveryStatus ;
    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order ;
}
