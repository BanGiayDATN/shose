package com.example.shose.server.service;

import com.example.shose.server.dto.request.product.CreateProductRequest;
import com.example.shose.server.dto.request.product.FindProductRequest;
import com.example.shose.server.dto.request.product.UpdateProductRequest;
import com.example.shose.server.dto.response.ProductResponse;
import com.example.shose.server.entity.Product;
import com.example.shose.server.infrastructure.common.base.PageableObject;

/**
 * @author Nguyễn Vinh
 */
public interface ProductService {
    PageableObject<ProductResponse> findAll(final FindProductRequest req);

    Product create(final CreateProductRequest req);

    Product update(final UpdateProductRequest req);

    Boolean delete( String id);

    Product getOneById( String id);
}