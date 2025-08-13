package com.chalapathi.ecommerce.payment;

import java.math.BigDecimal;

import com.chalapathi.ecommerce.customer.CustomerResponse;
import com.chalapathi.ecommerce.order.PaymentMethod;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
