package dev.yassiraitelghari.orderservice.controller.v1;
import dev.yassiraitelghari.orderservice.dto.DeliveryDTO;
import dev.yassiraitelghari.orderservice.dto.OrderDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @PostMapping
    public ResponseEntity<?> add(@RequestBody OrderDTO orderDTO) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editAll(@PathVariable UUID id, @RequestBody OrderDTO orderDTO) {
        return null;
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> edit(@PathVariable UUID id, @RequestBody Map<String, Object> body) {
        return null;
    }

    @GetMapping
    public ResponseEntity<?> getAll(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable UUID id) {
        return null;
    }


}
