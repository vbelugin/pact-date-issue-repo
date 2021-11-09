package com.example.products;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
@EqualsAndHashCode
class Product {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String id;
    private String name;
    private String type;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate toDate;

    Product() {
    }

    Product(String id, String name, String type, LocalDate toDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.toDate = toDate;
    }
}