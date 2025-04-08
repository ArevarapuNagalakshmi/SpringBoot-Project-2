package com.Developers.Developers.Controller;

import com.Developers.Developers.Dto.DeveloperDto;
import com.Developers.Developers.Entity.Developer;
import com.Developers.Developers.Services.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/developer")
public class DeveloperController {
    @Autowired
    private DeveloperService developerService;

    @PostMapping("/savedeveloper")
    public ResponseEntity<DeveloperDto> saveLaptop(@RequestBody DeveloperDto developerDto){
        DeveloperDto developerDto1=developerService.saveDeveloper(developerDto);
        return new ResponseEntity<>(developerDto1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<DeveloperDto>getDeveloper(@PathVariable Long id){
        DeveloperDto developerDto=developerService.getDeveloper(id);
        return new ResponseEntity<>(developerDto,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<DeveloperDto>updateDeveloper(
            @PathVariable Long id,
            @RequestBody DeveloperDto developerDto) {
        DeveloperDto developerDto1=developerService.updateDeveloper(id,developerDto);
        return new ResponseEntity<>(developerDto1,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Developer>deleteDeveloper(@PathVariable Long id){
        Developer developer=developerService.deleteDeveloper(id);
        return new ResponseEntity<>(developer,HttpStatus.OK);
    }


}
