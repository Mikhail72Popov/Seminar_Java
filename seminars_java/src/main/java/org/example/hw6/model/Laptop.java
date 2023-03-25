package org.example.hw6.model;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Laptop {
    private String producer;
    private Integer randomMemory;
    private Integer hardDisk;
    private String operSystem;
    private String color;

    public Laptop(String producer, int randomMemory, int hardDisk, String operSystem, String color) {
        this.producer = producer;
        this.randomMemory = randomMemory;
        this.hardDisk = hardDisk;
        this.operSystem = operSystem;
        this.color = color;
    }
}