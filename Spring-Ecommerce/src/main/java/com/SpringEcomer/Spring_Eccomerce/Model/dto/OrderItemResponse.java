package com.SpringEcomer.Spring_Eccomerce.Model.dto;

import java.math.BigDecimal;

public record OrderItemResponse(
        String productName,
        int quantity,
        BigDecimal totalPrice
) {}
