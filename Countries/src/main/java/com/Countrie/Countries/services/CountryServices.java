package com.Countrie.Countries.services;

import com.Countrie.Countries.dto.CountryDto;
import com.Countrie.Countries.entity.CountryEntity;

public interface CountryServices {
    CountryDto savecountry(CountryDto countryDto);
    CountryDto getcountry(int id);
    CountryDto updatecountry(int id,CountryDto countryDto);
    CountryEntity deletecountry(int id);
}
