package com.SpringEcomer.Spring_Eccomerce.Model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {}