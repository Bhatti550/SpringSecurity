package com.project.springsecurity.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name", insertable = true)
    private String firstName;
    @Column(name = "last_name", insertable = true)
    private String lastName;
    @Column(name = "mobile_number",length = 10, insertable = true)
    private Integer mobileNumber;
    @Column(name = "email", unique = true, insertable = true)
    private String email;
    @Column(name = "password", insertable = true)
    private String password;
}
