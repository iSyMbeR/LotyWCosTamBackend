package com.lotywkosmos.lotywkosmos.Entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) long id;
    private @Column(unique = true) String login;
    private String password;
    private String name;
    private String surname;
    private LocalDate date_of_birth;
}
