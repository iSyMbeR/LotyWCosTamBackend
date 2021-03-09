package com.lotywkosmos.lotywkosmos.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Table(name = "PORT_LINKS")
public class PortLink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Port StartingPort;
    @OneToOne
    private Port EndPort;
}
