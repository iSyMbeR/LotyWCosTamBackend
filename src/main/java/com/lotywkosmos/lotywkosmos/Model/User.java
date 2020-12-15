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
@Table(name = "USERS")
public class User {
    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private @Column(unique = true)
    String login;
    private String password;
    private char sex;
    private String firstName;
    private String lastName;
    private LocalDate date_of_birth;
}
