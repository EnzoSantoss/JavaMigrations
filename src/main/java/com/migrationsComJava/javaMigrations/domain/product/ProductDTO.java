package com.migrationsComJava.javaMigrations.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductDTO(String name,Integer price_in_cents) {
}
