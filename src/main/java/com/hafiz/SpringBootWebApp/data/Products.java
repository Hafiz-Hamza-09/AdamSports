package com.hafiz.SpringBootWebApp.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;



@Data  // @Data - Lombok library used to create constructors, getters and setters
@AllArgsConstructor // @AllArgsConstructors initializes all provided field, check Service class
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity // @Entity - Spring JPA ORM mapping to Database
public class Products {

    @Id // @Id - Primary Key mapping
    private int productId;
    private String productName;
    private double price;

}
