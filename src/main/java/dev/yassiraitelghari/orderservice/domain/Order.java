package dev.yassiraitelghari.orderservice.domain;

import dev.yassiraitelghari.orderservice.domain.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id ;

    @Column(unique = true, nullable = false)
    private String reference;

    private LocalDateTime date ;

    private Status status;

    private UUID userId ;
    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItem ;

}
