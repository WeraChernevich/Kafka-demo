package ru.cherva.productdemo.service;

import ru.cherva.productdemo.service.dto.CreateProductDto;

import java.util.concurrent.ExecutionException;

public interface ProductService {
    String createProduct(CreateProductDto createProductDto) throws ExecutionException, InterruptedException;
}
