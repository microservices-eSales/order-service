package dev.yassiraitelghari.orderservice.mapper;

import dev.yassiraitelghari.orderservice.domain.Delivery;
import dev.yassiraitelghari.orderservice.dto.DeliveryDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DeliveryMapper {
   public  Delivery deliveryDTOToDelivery(DeliveryDTO deliveryDTO);

    public DeliveryDTO deliveryToDeliveryDTO(Delivery delivery);
}
