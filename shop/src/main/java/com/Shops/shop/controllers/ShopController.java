package com.Shops.shop.controllers;

import com.Shops.shop.dto.ShopDto;
import com.Shops.shop.entity.ShopEntity;
import com.Shops.shop.services.ShopServices.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private Impl impl;

    @PostMapping("/saveshop")
    public ResponseEntity<ShopDto>saveshop(@RequestBody ShopDto shopDto){
        ShopDto shopDto1=impl.saveshop(shopDto);
        return new ResponseEntity<>(shopDto1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ShopDto>getshop(@PathVariable Long id){
    ShopDto shopDto=impl.getshop(id);
        return new ResponseEntity<>(shopDto,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ShopDto>updateshop(@PathVariable Long id,@RequestBody ShopDto shopDto){
        ShopDto shopDto1=impl.updateshop(id,shopDto);
        return new ResponseEntity<>(shopDto1,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<ShopEntity>deleteshop(@PathVariable Long id){
ShopEntity shopEntity=impl.deleteshop(id);
        return new ResponseEntity<>(shopEntity,HttpStatus.OK);
    }


}
