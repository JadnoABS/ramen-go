package com.jadnobarbosa.ramengo.order;

import com.jadnobarbosa.ramengo.order.dto.Broth;
import com.jadnobarbosa.ramengo.order.dto.OrderRequest;
import com.jadnobarbosa.ramengo.order.dto.OrderResponse;
import com.jadnobarbosa.ramengo.order.dto.Protein;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/broths")
    public ResponseEntity<List<Broth>> getBroths() {
        return ResponseEntity.ok().body(orderService.getBroths());
    }

    @GetMapping("/proteins")
    public ResponseEntity<List<Protein>> getProteins() {
        return ResponseEntity.ok().body(orderService.getProteins());
    }

    @PostMapping("/orders")
    public ResponseEntity<OrderResponse> postOrder(@RequestBody OrderRequest request) {
        return ResponseEntity.ok().body(orderService.postOrder(request));
    }

}
