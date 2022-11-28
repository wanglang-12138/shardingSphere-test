//package com.wl.shardingsphere.domain;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "t_order_item")
//public class OrderItem {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "order_item_id")
//    private Long orderItemId;
//
//    @Column(name = "order_item_name")
//    private String orderItemName;
//
//    @OneToOne
//    private Order order;
//
//    @OneToMany
//    private User user;
//
//}
