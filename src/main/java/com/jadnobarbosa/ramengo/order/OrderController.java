package com.jadnobarbosa.ramengo.order;

import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/broths")
    public ResponseEntity<?> getBroths() {
        return ResponseEntity.ok().body(orderService.getBroths());
    }

}
