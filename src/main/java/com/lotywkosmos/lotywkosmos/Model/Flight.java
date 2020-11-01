package com.lotywkosmos.lotywkosmos.Model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Table(name = "FLIGHTS")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int maxSize;
    private LocalDate start_date;
    private LocalDate end_date;
    private Double ticketPrice;
    @OneToOne
    private PortLink portLink;
}
