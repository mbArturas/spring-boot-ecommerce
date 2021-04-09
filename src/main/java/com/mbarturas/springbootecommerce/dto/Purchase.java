package com.mbarturas.springbootecommerce.dto;

import com.mbarturas.springbootecommerce.entity.Address;
import com.mbarturas.springbootecommerce.entity.Customer;
import com.mbarturas.springbootecommerce.entity.Order;
import com.mbarturas.springbootecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
