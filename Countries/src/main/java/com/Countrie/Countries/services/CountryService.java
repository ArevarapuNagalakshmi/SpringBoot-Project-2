package com.Countrie.Countries.services;

import com.Countrie.Countries.dto.CountryDto;
import com.Countrie.Countries.entity.CountryEntity;
import com.Countrie.Countries.repository.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService implements CountryServices {
    @Autowired
    private CountryRepo countryRepo;

    @Override
    public CountryDto savecountry(CountryDto countryDto) {
        CountryEntity countryEntity=new CountryEntity(
                countryDto.getId(),
                countryDto.getName(),
                countryDto.getLocation(),
                countryDto.getPopulation(),
                countryDto.getTransport(),
                countryDto.getLanguages()

        );
        CountryEntity countryEntity1=countryRepo.save(countryEntity);
        CountryDto countryDto1=new CountryDto(
                countryEntity1.getId(),
                countryEntity1.getName(),
                countryEntity1.getLocation(),
                countryEntity1.getPopulation(),
                countryEntity1.getTransport(),
                countryEntity1.getLanguages()
        );
        return countryDto1;
    }

    @Override
    public CountryDto getcountry(int id) {
        CountryEntity countryEntity=countryRepo.findByid(id);
        return new CountryDto(
                countryEntity.getId(),
                countryEntity.getName(),
                countryEntity.getLocation(),
                countryEntity.getPopulation(),
                countryEntity.getTransport(),
                countryEntity.getLanguages()
        );
    }

    @Override
    public CountryDto updatecountry(int id, CountryDto countryDto) {
        CountryEntity countryEntity=countryRepo.findByid(id);
        countryEntity.setName(countryDto.getName());
        countryEntity.setLocation(countryDto.getLocation());
        countryEntity.setPopulation(countryDto.getPopulation());
        countryEntity.setTransport(countryDto.getTransport());
        countryEntity.setLanguages(countryDto.getLanguages());
        CountryEntity countryEntity1=countryRepo.save(countryEntity);
        return new CountryDto(
                countryEntity1.getId(),
                countryEntity1.getName(),
                countryEntity1.getLocation(),
                countryEntity1.getPopulation(),
                countryEntity1.getTransport(),
                countryEntity1.getLanguages()
        );
    }

    @Override
    public CountryEntity deletecountry(int id) {
  CountryEntity countryEntity=countryRepo.findByid(id);
        countryRepo.deleteById(id);
        return countryEntity;
    }
}
