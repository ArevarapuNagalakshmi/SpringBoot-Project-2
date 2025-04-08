package com.Fruits.Fruits.Dto;

import java.util.Objects;

public class FruitDto {
    private Long id;
    private String name;
    private  String color;
    private String price;

    public FruitDto(Long id, String name, String color, String price) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public FruitDto() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FruitDto fruitDto = (FruitDto) o;
        return Objects.equals(id, fruitDto.id) && Objects.equals(name, fruitDto.name) && Objects.equals(color, fruitDto.color) && Objects.equals(price, fruitDto.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, price);
    }

    @Override
    public String toString() {
        return "FruitDto{" +
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
