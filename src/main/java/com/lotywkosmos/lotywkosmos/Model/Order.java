package com.lotywkosmos.lotywkosmos.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;
    @OneToOne
    private User user;
    private double summaryPrice;
}
