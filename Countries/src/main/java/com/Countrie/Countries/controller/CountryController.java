package com.Countrie.Countries.controller;

import com.Countrie.Countries.dto.CountryDto;
import com.Countrie.Countries.entity.CountryEntity;
import com.Countrie.Countries.services.CountryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryServices countryServices;

    @PostMapping("/savecountries")
    public ResponseEntity<CountryDto>savecountry(@RequestBody CountryDto countryDto){
   CountryDto countryDto1=countryServices.savecountry(countryDto);
        return new ResponseEntity<>(countryDto1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CountryDto>getcountry(@PathVariable int id){
      CountryDto countryDto=countryServices.getcountry(id);
        return new ResponseEntity<>(countryDto,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<CountryDto>updatecountry(@PathVariable int id,@RequestBody CountryDto countryDto){
     CountryDto countryDto1=countryServices.updatecountry(id,countryDto);
        return new ResponseEntity<>(countryDto1,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<CountryEntity>deletecountry(@PathVariable int id){
    CountryEntity countryEntity=countryServices.deletecountry(id);
        return new ResponseEntity<>(countryEntity,HttpStatus.OK);
    }

}
