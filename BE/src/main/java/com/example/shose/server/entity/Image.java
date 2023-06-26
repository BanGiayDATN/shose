package com.example.shose.server.entity;

import com.example.shose.server.entity.base.PrimaryEntity;
import com.example.shose.server.infrastructure.constant.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Nguyễn Vinh
 */
@Entity
@Getter
@Setter
@ToString
@Builder
@Table(name = "image")
@AllArgsConstructor
@NoArgsConstructor
public class Image extends PrimaryEntity {

    private String name;

    private Status status;

    @ManyToOne
    @JoinColumn(name = "id_product_detail",referencedColumnName = "id")
    private ProductDetail productDetail;
}