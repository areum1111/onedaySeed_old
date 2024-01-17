package com.boot.onedaySeed.entity;

import com.boot.onedaySeed.constant.OrderStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//주문서 하나하나
@Entity
@Table(name="order")
@Getter
@Setter
@ToString
public class Order extends BaseEntity {

    @Id
    @Column(name = "order_id")
    private Long orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "payment_id")
    private Payment payment;

    @Column(nullable = false , name = "order_date")
    private LocalDateTime orderDate;



    @Enumerated(EnumType.STRING)
    @Column(name = "order_status") //주문 상태
    private OrderStatus orderStatus; //ORDER or CANCEL

}
