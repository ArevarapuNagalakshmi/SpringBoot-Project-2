package com.Fruits.Fruits.Controller;

import com.Fruits.Fruits.Dto.FruitDto;
import com.Fruits.Fruits.Entity.Fruits;
import com.Fruits.Fruits.Services.FruitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fruits")
public class FruitsController {
    @Autowired
    private FruitsService fruitsService;

    @PostMapping("/savefruit")
    public ResponseEntity<FruitDto> savefruit(@RequestBody FruitDto fruitDto){
       FruitDto fruitDto1=fruitsService.saveFruits(fruitDto);
        return new ResponseEntity<>(fruitDto1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<FruitDto>getfruit(@PathVariable Long id){
        FruitDto fruitDto=fruitsService.getFruits(id);
        return new ResponseEntity<>(fruitDto,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<FruitDto>updateLaptop(
            @PathVariable Long id,
            @RequestBody FruitDto fruitDto) {
        FruitDto fruitDto1=fruitsService.updateFruits(id,fruitDto);
        return new ResponseEntity<>(fruitDto1,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Fruits>deletefruits(@PathVariable Long id){
        Fruits fruits=fruitsService.deleteFruits(id);
        return new ResponseEntity<>(fruits,HttpStatus.OK);
    }
}
