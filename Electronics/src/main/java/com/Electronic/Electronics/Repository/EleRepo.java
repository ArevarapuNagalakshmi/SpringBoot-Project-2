package com.Electronic.Electronics.Repository;

import com.Electronic.Electronics.entity.Electronic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EleRepo extends JpaRepository<Electronic,Integer> {
    Electronic findById(int id);
}
