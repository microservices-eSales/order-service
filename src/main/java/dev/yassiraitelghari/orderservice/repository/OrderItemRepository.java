package dev.yassiraitelghari.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderItemRepository  extends JpaRepository<OrderRepository , UUID> {
}
