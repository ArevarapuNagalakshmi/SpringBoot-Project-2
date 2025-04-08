package com.Fruits.Fruits.Services;

import com.Fruits.Fruits.Dto.FruitDto;
import com.Fruits.Fruits.Entity.Fruits;
import com.Fruits.Fruits.Repository.FruitsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitsService {
    @Autowired
    private FruitsRepo fruitsRepo;


    public FruitDto saveFruits(FruitDto fruitDto) {
        Fruits fruits=new Fruits(
              fruitDto.getId(),
                fruitDto.getName(),
                fruitDto.getColor(),
                fruitDto.getPrice()
        );
       Fruits fruits1=fruitsRepo.save(fruits);
        FruitDto fruitDto1=new FruitDto(
                fruits1.getId(),
                fruits1.getName(),
                fruits1.getColor(),
                fruits1.getPrice()

        );
        return fruitDto1;
    }

    public FruitDto getFruits(Long id) {
        Fruits fruits=fruitsRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The fruit id is not found :"+id));
        FruitDto fruitDto=new FruitDto(
                fruits.getId(),
                fruits.getName(),
                fruits.getColor(),
                fruits.getPrice()
        );
        return fruitDto;

    }


    public FruitDto updateFruits(Long id, FruitDto fruitDto) {
        Fruits fruits=fruitsRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The fruit id is not found:"+id));
        fruits.setName(fruitDto.getName());
        fruits.setColor(fruitDto.getColor());
        fruitDto.setPrice(fruitDto.getPrice());
       Fruits fruits1=fruitsRepo.save(fruits);
        return new FruitDto(
                fruits1.getId(),
                fruits1.getName(),
                fruits.getColor(),
                fruits.getPrice()
        );
    }

    public Fruits deleteFruits(Long id) {
        Fruits fruits=fruitsRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The laptop id is not found :"+id));
        fruitsRepo.deleteById(id);
        return fruits;
    }
}
