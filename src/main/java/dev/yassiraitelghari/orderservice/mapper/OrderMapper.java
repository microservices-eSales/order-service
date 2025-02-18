package dev.yassiraitelghari.orderservice.mapper;

import dev.yassiraitelghari.orderservice.domain.Order;
import dev.yassiraitelghari.orderservice.dto.OrderDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderDTO orderToOrderDTO(Order order);


    Order orderDTOToOrder(OrderDTO orderDTO);
}