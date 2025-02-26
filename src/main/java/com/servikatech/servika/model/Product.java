package com.servikatech.servika.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "uuid")
    private UUID id;

    @Size(min = 3, max = 100, message = "product name must be between 3 and 100 character")
    @NotBlank(message = "product name is can not be blank")
    private String name;

    @Size(max = 500, message = "The description should not exceed 500 words")
    private String description;

    @NotNull(message = "price is can not be null")
    @Positive(message = "price is greater than zero")
    private Double price;

}
