package com.chalapathi.ecommerce.orderline;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderLineService {

    private final OrderLineRepository repository;
    private final OrderLineMapper mapper;

    public Integer saveOrderLine(OrderLineRequest request) {
        var order = mapper.toOrderLine(request);
        OrderLine orderLine = null;
        if(request.orderId() != null && this.repository.findById(request.orderId()).isPresent()) {
        	orderLine = this.repository.findById(request.orderId()).get();
        	orderLine.setOrder(order.getOrder());
        	orderLine.setProductId(order.getProductId());
        	orderLine.setQuantity(order.getQuantity());
        	this.repository.save(orderLine);
       } else {
    	   orderLine = this.repository.save(order);
       } 
        return orderLine.getId();
    }

    public List<OrderLineResponse> findAllByOrderId(Integer orderId) {
        return repository.findAllByOrderId(orderId)
                .stream()
                .map(mapper::toOrderLineResponse)
                .collect(Collectors.toList());
    }
}
