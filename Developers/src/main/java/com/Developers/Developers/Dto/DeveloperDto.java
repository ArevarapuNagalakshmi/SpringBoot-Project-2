package com.Developers.Developers.Dto;

import java.util.Objects;

public class DeveloperDto {
    private Long id;
    private String name;
    private String company;
    private String role;
    private int price;

    public DeveloperDto(Long id, String name, String company, String role, int price) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.role = role;
        this.price = price;
    }

    public DeveloperDto() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DeveloperDto that = (DeveloperDto) o;
        return price == that.price && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(company, that.company) && Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, company, role, price);
    }

    @Override
    public String toString() {
        return "DeveloperDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", role='" + role + '\'' +
                ", price=" + price +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
