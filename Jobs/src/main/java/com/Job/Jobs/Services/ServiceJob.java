package com.Job.Jobs.Services;

import com.Job.Jobs.Dto.JobDto;

public interface ServiceJob {
    JobDto savejob(JobDto jobDto);
    JobDto getjob(int id);
    JobDto updatejob(int id,JobDto jobDto);

}
