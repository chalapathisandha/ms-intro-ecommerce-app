package com.chalapathi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/load-test/api/v1")
@RequiredArgsConstructor
public class HelloController {

	private final ProductClient productClient;

	@GetMapping("/load-products")
	public ResponseEntity<ProductResp> loadProductsFromProductService() {
		return ResponseEntity.ok(this.productClient.loadProducts());
	}

}

