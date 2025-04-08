package com.Job.Jobs.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
public class EntityJob {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String role;
    private Long experience;

    public EntityJob(int id, String name, String role, Long experience) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.experience = experience;
    }

    public EntityJob() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EntityJob entityJob = (EntityJob) o;
        return id == entityJob.id && Objects.equals(name, entityJob.name) && Objects.equals(role, entityJob.role) && Objects.equals(experience, entityJob.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, role, experience);
    }

    @Override
    public String toString() {
        return "EntityJob{" +
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
