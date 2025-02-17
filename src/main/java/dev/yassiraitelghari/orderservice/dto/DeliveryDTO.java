package dev.yassiraitelghari.orderservice.dto;

import dev.yassiraitelghari.orderservice.domain.enums.DeliveryStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryDTO {
    private int trackingNumber;
    private DeliveryStatus status ;
}
