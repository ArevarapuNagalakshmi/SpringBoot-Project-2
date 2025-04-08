package com.Electronic.Electronics.Services;

import com.Electronic.Electronics.Dto.ElectronicDto;
import com.Electronic.Electronics.Repository.EleRepo;
import com.Electronic.Electronics.entity.Electronic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EService implements EServices {
    @Autowired
    private EleRepo eleRepo;


    @Override
    public ElectronicDto save(ElectronicDto electronicDto) {
        Electronic electronic=new Electronic(
                electronicDto.getId(),
                electronicDto.getName(),
                electronicDto.getBrand(),
                electronicDto.getPrice(),
                electronicDto.getRating()
        );
        Electronic electronic1=eleRepo.save(electronic);
        ElectronicDto electronicDto1=new ElectronicDto(
                electronic1.getId(),
                electronic1.getName(),
                electronic1.getBrand(),
                electronic1.getPrice(),
                electronic1.getRating()
        );
        return electronicDto1;
    }

    @Override
    public ElectronicDto get(int id) {
        Electronic electronic=eleRepo.findById(id);
        return new ElectronicDto(
                electronic.getId(),
                electronic.getName(),
                electronic.getBrand(),
                electronic.getPrice(),
                electronic.getRating()
        );
    }

    @Override
    public ElectronicDto update(int id, ElectronicDto electronicDto) {
        Electronic electronic=eleRepo.findById(id);
        electronic.setName(electronicDto.getName());
        electronic.setBrand(electronicDto.getBrand());
        electronic.setPrice(electronicDto.getPrice());
        electronic.setRating(electronicDto.getRating());
        Electronic electronic1=eleRepo.save(electronic);
        return new ElectronicDto(
                electronic1.getId(),
                electronic1.getName(),
                electronic1.getBrand(),
                electronic1.getPrice(),
                electronic1.getRating()
        );
    }

    public Electronic delete(int id){
      Electronic electronic=eleRepo.findById(id);
        eleRepo.deleteById(id);
        return electronic;
    }
}
