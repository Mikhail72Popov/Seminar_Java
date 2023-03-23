package org.example.hw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Cost {
    private String product;
    private Double price;
    private String grade;
}
