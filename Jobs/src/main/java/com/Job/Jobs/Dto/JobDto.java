package com.Job.Jobs.Dto;

import java.util.Objects;

public class JobDto {
    private int id;
    private String name;
    private String role;
    private Long experience;

    public JobDto(int id, String name, String role, Long experience) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.experience = experience;
    }

    public JobDto() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        JobDto jobDto = (JobDto) o;
        return id == jobDto.id && Objects.equals(name, jobDto.name) && Objects.equals(role, jobDto.role) && Objects.equals(experience, jobDto.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, role, experience);
    }

    @Override
    public String toString() {
        return "JobDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", experience=" + experience +
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getExperience() {
        return experience;
    }

    public void setExperience(Long experience) {
        this.experience = experience;
    }
}
