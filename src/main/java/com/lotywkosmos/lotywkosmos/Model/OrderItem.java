package com.lotywkosmos.lotywkosmos.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "ORDER_ITEMS")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Order idOrder;
    @OneToOne
    private Flight idFlight;

    public OrderItem(Order idOrder, Flight idFlight) {
        this.idOrder = idOrder;
        this.idFlight = idFlight;
    }
}
