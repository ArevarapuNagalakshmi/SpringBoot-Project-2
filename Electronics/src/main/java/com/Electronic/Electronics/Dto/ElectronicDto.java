package com.Electronic.Electronics.Dto;

import java.util.Objects;

public class ElectronicDto {
    private int id;
    private String name;
    private String brand;
    private double price;
    private String rating;

    public ElectronicDto(int id, String name, String brand, double price, String rating) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.rating = rating;
    }

    public ElectronicDto() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ElectronicDto that = (ElectronicDto) o;
        return id == that.id && Double.compare(price, that.price) == 0 && Objects.equals(name, that.name) && Objects.equals(brand, that.brand) && Objects.equals(rating, that.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, brand, price, rating);
    }

    @Override
    public String toString() {
        return "ElectronicDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", rating='" + rating + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
