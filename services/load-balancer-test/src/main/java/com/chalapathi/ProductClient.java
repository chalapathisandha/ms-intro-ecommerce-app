package com.chalapathi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product-service")
public interface ProductClient {
	@GetMapping("/api/sample-products")
	ProductResp loadProducts();
}
