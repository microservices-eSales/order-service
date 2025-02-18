package dev.yassiraitelghari.orderservice.repository;

import dev.yassiraitelghari.orderservice.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderItemRepository  extends JpaRepository<OrderItem, UUID> {
}
