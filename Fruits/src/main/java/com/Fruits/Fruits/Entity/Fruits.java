package com.Fruits.Fruits.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Objects;

@Entity
public class Fruits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  String color;
    private String price;

    public Fruits(Long id, String name, String color, String price) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public Fruits() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Fruits fruits = (Fruits) o;
        return Objects.equals(id, fruits.id) && Objects.equals(name, fruits.name) && Objects.equals(color, fruits.color) && Objects.equals(price, fruits.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, price);
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
