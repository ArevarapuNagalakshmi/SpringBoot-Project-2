package com.Shops.shop.services.ShopServices;

import com.Shops.shop.dto.ShopDto;
import com.Shops.shop.entity.ShopEntity;
import com.Shops.shop.repository.ShopRepo;
import com.Shops.shop.services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Impl implements ShopService {
    @Autowired
    private ShopRepo shopRepo;

    @Override
    public ShopDto saveshop(ShopDto shopDto) {
        ShopEntity shopEntity=new ShopEntity(
                shopDto.getId(),
                shopDto.getName(),
                shopDto.getItem(),
                shopDto.getPrice()
        );
        ShopEntity shopEntity1=shopRepo.save(shopEntity);
        ShopDto shopDto1=new ShopDto(
                shopEntity1.getId(),
                shopEntity1.getName(),
                shopEntity1.getItem(),
                shopEntity1.getPrice()
        );
        return shopDto1;
    }

    @Override
    public ShopDto getshop(Long id) {
        ShopEntity shopEntity=shopRepo.findByid(id);

        return new ShopDto(
                shopEntity.getId(),
                shopEntity.getName(),
                shopEntity.getItem(),
                shopEntity.getPrice()
        );
    }

    @Override
    public ShopDto updateshop(Long id, ShopDto shopDto) {
        ShopEntity shopEntity= shopRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("The ID is not present: " +id));
        shopEntity.setName(shopDto.getName());
        shopEntity.setItem(shopDto.getItem());
        shopEntity.setPrice(shopDto.getPrice());

        ShopEntity shopEntity1=shopRepo.save(shopEntity);
        return new ShopDto(
                shopEntity1.getId(),
                shopEntity1.getName(),
                shopEntity1.getItem(),
                shopEntity1.getPrice()
        );
    }
    public ShopEntity deleteshop(Long id){
        ShopEntity shopEntity=shopRepo.findByid(id);
        shopRepo.deleteById(id);
        return shopEntity;
    }


}
