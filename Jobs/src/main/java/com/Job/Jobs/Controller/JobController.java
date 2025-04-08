package com.Job.Jobs.Controller;

import com.Job.Jobs.Dto.JobDto;
import com.Job.Jobs.Entity.EntityJob;
import com.Job.Jobs.Services.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/job")
public class JobController {
    @Autowired
    private ServiceImpl service;

    @PostMapping("/savejob")
    public ResponseEntity<JobDto>savejob(@RequestBody JobDto jobDto){
        JobDto jobDto1=service.savejob(jobDto);
        return new ResponseEntity<>(jobDto1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<JobDto>getjob(@PathVariable int id){
   JobDto jobDto=service.getjob(id);
        return new ResponseEntity<>(jobDto,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<JobDto>updatejob(@PathVariable int id,
                                           @RequestBody JobDto jobDto){
     JobDto jobDto1=service.updatejob(id,jobDto);
        return new ResponseEntity<>(jobDto1,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<EntityJob>deletejob(@PathVariable int id){
    EntityJob entityJob=service.deletejob(id);
        return new ResponseEntity<>(entityJob,HttpStatus.OK);
    }
}
