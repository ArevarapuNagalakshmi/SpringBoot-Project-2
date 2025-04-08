package com.Job.Jobs.Services;

import com.Job.Jobs.Dto.JobDto;
import com.Job.Jobs.Entity.EntityJob;
import com.Job.Jobs.Repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceJob{
    @Autowired
    private JobRepo jobRepo;

    @Override
    public JobDto savejob(JobDto jobDto) {
        EntityJob entityJob=new EntityJob(
                jobDto.getId(),
                jobDto.getName(),
                jobDto.getRole(),
                jobDto.getExperience()
        );
        EntityJob entityJob1=jobRepo.save(entityJob);
        JobDto jobDto1=new JobDto(
                entityJob1.getId(),
                entityJob1.getName(),
                entityJob1.getRole(),
                entityJob1.getExperience()
        );
        return jobDto1;
    }

    @Override
    public JobDto getjob(int id) {
        EntityJob entityJob=jobRepo.findByid(id);
        return new JobDto(
                entityJob.getId(),
                entityJob.getName(),
                entityJob.getRole(),
                entityJob.getExperience()
        );
    }

    @Override
    public JobDto updatejob(int id, JobDto jobDto) {
        EntityJob entityJob=jobRepo.findByid(id);
        entityJob.setName(jobDto.getName());
        entityJob.setRole(jobDto.getRole());
        entityJob.setExperience(jobDto.getExperience());
        EntityJob entityJob1=jobRepo.save(entityJob);
        return new JobDto(
                entityJob1.getId(),
                entityJob1.getName(),
                entityJob1.getRole(),
                entityJob1.getExperience()
        );
    }
    public EntityJob deletejob(int id){
    EntityJob entityJob=jobRepo.findByid(id);
        jobRepo.deleteById(id);
        return entityJob;
    }
}
