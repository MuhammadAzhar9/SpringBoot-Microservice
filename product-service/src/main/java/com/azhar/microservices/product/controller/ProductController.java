package com.azhar.microservices.product.controller;

import com.azhar.microservices.product.dto.ProductRequest;
import com.azhar.microservices.product.dto.ProductResponse;
// import com.azhar.microservices.product.model.Product;
import com.azhar.microservices.product.service.ProductService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest) {
        return productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        // try {
        //     Thread.sleep(5000);
        // } catch (InterruptedException e) {
        //     throw new RuntimeException(e);
        // }

        return productService.getAllProducts();

    }
}
