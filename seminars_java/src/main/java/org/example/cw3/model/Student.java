package org.example.cw3.model;

import lombok.Data;
import lombok.AllArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
public class Student {
    private String surname;
    private int groupNumber;
    private double money;
    private List<Integer> evaluations;
}

