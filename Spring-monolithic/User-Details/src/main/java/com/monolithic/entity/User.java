package com.monolithic.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor  // ✅ Required by JPA
@AllArgsConstructor
@Table(name = "users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)  // Ensures 'name' cannot be null
    private String name;
}
