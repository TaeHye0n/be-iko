package com.iko.iko.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name="tb_order_details")
@DynamicInsert
@DynamicUpdate
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LinkOrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="link_order_details_id_pk",unique = true, nullable = false)
    private Integer linkId;

    @Column(name="product_details_id_fk",nullable = false)
    private Integer productDetailsId;

    @Column(name="order_id_fk",nullable = false)
    private Integer orderId;
}