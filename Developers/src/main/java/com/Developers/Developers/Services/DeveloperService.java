package com.Developers.Developers.Services;

import com.Developers.Developers.Dto.DeveloperDto;
import com.Developers.Developers.Entity.Developer;
import com.Developers.Developers.Repository.DeveloperRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeveloperService {
    @Autowired
    private DeveloperRepo developerRepo;

    public DeveloperDto saveDeveloper(DeveloperDto developerDto) {
        Developer developer =new Developer(
                developerDto.getId(),
                developerDto.getName(),
                developerDto.getCompany(),
                developerDto.getRole(),
                developerDto.getPrice()
        );
        Developer developer1=developerRepo.save(developer);
        DeveloperDto developerDto1=new DeveloperDto(
                developer1.getId(),
                developer1.getName(),
                developer1.getCompany(),
                developer1.getRole(),
                developer1.getPrice()
        );

        return developerDto1;
    }


    public DeveloperDto getDeveloper(Long id) {
        Developer developer=developerRepo.findById(id)
               .orElseThrow(()->new RuntimeException("The Laptop id is not found :"+id));
        DeveloperDto developerDto=new DeveloperDto(
               developer.getId(),
                developer.getName(),
                developer.getCompany(),
                developer.getRole(),
                developer.getPrice()
        );
        return developerDto;

    }


    public DeveloperDto updateDeveloper(Long id, DeveloperDto developerDto) {
        Developer developer=developerRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The laptop id is not found:"+id));
       developer.setName(developerDto.getName());
       developer.setCompany(developerDto.getCompany());
       developer.setRole(developerDto.getRole());
       developer.setPrice(developerDto.getPrice());
       Developer developer1=developerRepo.save(developer);
        return new DeveloperDto(
                developer1.getId(),
                developer1.getName(),
                developer1.getCompany(),
                developer1.getRole(),
                developer1.getPrice()
        );
    }


    public Developer deleteDeveloper(Long id) {
        Developer developer=developerRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The laptop id is not found :"+id));
        developerRepo.deleteById(id);
        return developer;
    }
}
