package com.lotywkosmos.lotywkosmos.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Table(name = "TICKETS")
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private User User;
    @OneToOne
    private Flight Flight;
    private Date bought;

    @PrePersist
    protected void onCreate() {
        bought = new Date();
    }
}
