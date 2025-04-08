package com.Countrie.Countries.repository;

import com.Countrie.Countries.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<CountryEntity,Integer> {
    CountryEntity findByid(int id);
}
