package com.hafiz.SpringBootWebApp.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;


@Data  // @Data - Lombok library used to create constructors, getters and setters
@AllArgsConstructor // @AllArgsConstructors initializes all provided field, check Service class
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity // @Entity - Spring JPA ORM mapping to Database
public class Products {

    @Id // @Id - Primary Key mapping
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // @GeneratedValue - Auto Generates ProductId
    private int productId;
    private String productname;
    private String description;
    private BigDecimal price;
    private String category;
    private String brand;
    private boolean available;


}
