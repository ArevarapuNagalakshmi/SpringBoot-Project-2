package com.Electronic.Electronics.Services;


import com.Electronic.Electronics.Dto.ElectronicDto;

public interface EServices {
    ElectronicDto save(ElectronicDto electronicDto);
    ElectronicDto get(int id);
    ElectronicDto update(int id,ElectronicDto electronicDto);


}
