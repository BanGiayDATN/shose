package com.example.shose.server.dto.response;

import com.example.shose.server.entity.ProductDetail;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;

/**
 * @author Nguyễn Vinh
 */

@Projection(types = {ProductDetail.class})
public interface ProductDetailReponse {

    @Value("#{target.id}")
    String getId();

    @Value("#{target.stt}")
    Integer getSTT();

    @Value("#{target.image}")
    String getImage();

    @Value("#{target.nameProduct}")
    String getNameProduct();

    @Value("#{target.price}")
    BigDecimal getPrice();

    @Value("#{target.created_date}")
    Long getCreateDate();

    @Value("#{target.gender}")
    Integer getGender();

    @Value("#{target.status}")
    Integer getStatus();
}