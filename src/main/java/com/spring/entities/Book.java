package com.spring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "NVARCHAR(50) NOT NULL")
    private String title;

    private String image;

    @Column(nullable = false, precision = 8,scale = 3)
    private BigDecimal price;

}
