package com.Developers.Developers.Repository;

import com.Developers.Developers.Entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepo extends JpaRepository<Developer,Long> {
    Developer findByid(Long id);
}
