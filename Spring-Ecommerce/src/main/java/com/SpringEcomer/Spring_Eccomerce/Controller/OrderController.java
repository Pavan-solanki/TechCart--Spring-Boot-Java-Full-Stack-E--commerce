package com.SpringEcomer.Spring_Eccomerce.Controller;



import com.SpringEcomer.Spring_Eccomerce.Model.dto.OrderRequest;
import com.SpringEcomer.Spring_Eccomerce.Model.dto.OrderResponse;
import com.SpringEcomer.Spring_Eccomerce.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/orders/place")
    public ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest orderRequest) {
        OrderResponse orderResponse = orderService.placeOrder(orderRequest);
        return new ResponseEntity<>(orderResponse, HttpStatus.CREATED);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<OrderResponse>> getAllOrders() {
        List<OrderResponse> orderResponseList = orderService.getAllOrderResponses();
        return new ResponseEntity<>(orderResponseList, HttpStatus.OK);
    }
}
