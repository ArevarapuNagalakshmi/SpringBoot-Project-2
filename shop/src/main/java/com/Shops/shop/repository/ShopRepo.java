package com.Shops.shop.repository;

import com.Shops.shop.entity.ShopEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepo extends JpaRepository<ShopEntity,Long> {
   ShopEntity findByid(Long id);
}
