package com.Countrie.Countries.dto;

import java.util.Objects;

public class CountryDto {
    private int id;
    private String name;
    private String location;
    private double population;
    private String transport;
    private String languages;

    public CountryDto(int id, String name, String location, double population, String transport, String languages) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.population = population;
        this.transport = transport;
        this.languages = languages;
    }

    public CountryDto() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CountryDto that = (CountryDto) o;
        return id == that.id && Double.compare(population, that.population) == 0 && Objects.equals(name, that.name) && Objects.equals(location, that.location) && Objects.equals(transport, that.transport) && Objects.equals(languages, that.languages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, location, population, transport, languages);
    }

    @Override
    public String toString() {
        return "CountryDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", population=" + population +
                ", transport='" + transport + '\'' +
                ", languages='" + languages + '\'' +
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
}
