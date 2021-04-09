package com.mbarturas.springbootecommerce.service;

import com.mbarturas.springbootecommerce.dto.Purchase;
import com.mbarturas.springbootecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder (Purchase purchase);
}
