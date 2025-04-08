package com.Fruits.Fruits.Repository;

import com.Fruits.Fruits.Entity.Fruits;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FruitsRepo extends JpaRepository<Fruits,Long> {
   Optional<Fruits> findById(Long id);
}
