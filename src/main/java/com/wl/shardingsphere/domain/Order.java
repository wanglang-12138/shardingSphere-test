package com.wl.shardingsphere.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @author WangLang
 */
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long order_id;

    @Column(name = "order_name")
    private String orderName;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
