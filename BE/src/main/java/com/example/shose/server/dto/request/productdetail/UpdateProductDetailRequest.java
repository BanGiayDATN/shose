package com.example.shose.server.dto.request.productdetail;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Nguyễn Vinh
 */
@Setter
@Getter
public class UpdateProductDetailRequest extends BaseProductDetailRequest{

    private String id;
}
