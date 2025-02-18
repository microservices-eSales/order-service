package dev.yassiraitelghari.orderservice.mapper;

import dev.yassiraitelghari.orderservice.domain.OrderItem;
import dev.yassiraitelghari.orderservice.dto.OrderItemDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {
    public OrderItem orderItemDTOToOrderItem(OrderItemDTO orderItemDTO);

    public OrderItemDTO orderItemToOrderItemDTO(OrderItem orderItem);
}
