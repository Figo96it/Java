package pl.sda.jpatraining.jpa;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
@Getter
@Setter
@Entity(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer id;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @Column(name = "total_cost")
    private BigDecimal totalCost;

    @ManyToOne
    private Customer customer;
}