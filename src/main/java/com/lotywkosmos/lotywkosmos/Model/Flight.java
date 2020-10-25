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
@Table(name = "FLIGHTS")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int maxSize;
    private LocalDate start_date;
    private LocalDate end_date;
    @OneToOne
    private PortLink portLink;

    public Flight(int maxSize, LocalDate start_date, LocalDate end_date, PortLink idPortLink) {
        this.maxSize = maxSize;
        this.start_date = start_date;
        this.end_date = end_date;
    }
}
