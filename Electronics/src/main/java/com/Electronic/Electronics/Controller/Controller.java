package com.Electronic.Electronics.Controller;

import com.Electronic.Electronics.Dto.ElectronicDto;
import com.Electronic.Electronics.Services.EService;
import com.Electronic.Electronics.entity.Electronic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/electronic")
public class Controller {
    @Autowired
    private EService eService;

    @PostMapping("/{save}")
    public ResponseEntity<ElectronicDto>saveele(@RequestBody ElectronicDto electronicDto){
    ElectronicDto electronicDto1=eService.save(electronicDto);
        return new ResponseEntity<>(electronicDto1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity <ElectronicDto>getele(@PathVariable int id){
         ElectronicDto electronicDto=eService.get(id);
        return new ResponseEntity<>(electronicDto,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ElectronicDto>updateele(@PathVariable int id,
                                                  @RequestBody ElectronicDto electronicDto){
    ElectronicDto electronicDto1=eService.update(id,electronicDto);
        return new ResponseEntity<>(electronicDto1,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Electronic>deleteele(@PathVariable int id){
      Electronic electronic=eService.delete(id);
        return new ResponseEntity<>(electronic,HttpStatus.OK);
    }
}
