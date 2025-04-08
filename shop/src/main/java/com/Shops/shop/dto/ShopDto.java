package com.Shops.shop.dto;

import java.util.Objects;

public class ShopDto {
    private Long id;
    private String name;
    private String item;
    private int price;

    public ShopDto(Long id, String name, String item, int price) {
        this.id = id;
        this.name = name;
        this.item = item;
        this.price = price;
    }
    public ShopDto(){
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ShopDto shopDto = (ShopDto) o;
        return price == shopDto.price && Objects.equals(id, shopDto.id) && Objects.equals(name, shopDto.name) && Objects.equals(item, shopDto.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, item, price);
    }

    @Override
    public String toString() {
        return "ShopDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", item='" + item + '\'' +
                ", price=" + price +
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

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
