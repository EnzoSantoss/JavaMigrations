package com.migrationsComJava.javaMigrations.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "product")
@Entity(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer price_in_cents;


    public Product(ProductDTO productDTO){

        this.name = productDTO.name();
        this.price_in_cents= productDTO.price_in_cents();
    }

}
