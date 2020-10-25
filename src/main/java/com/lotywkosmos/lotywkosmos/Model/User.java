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
@Table(name = "USERS")
public class User {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private @Column(unique = true)
    String login;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate date_of_birth;
    public User(String login, String password, String firstName, String lastName, LocalDate date_of_birth) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.date_of_birth = date_of_birth;
    }
}