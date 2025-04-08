package com.Job.Jobs.Repository;

import com.Job.Jobs.Entity.EntityJob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<EntityJob,Integer> {
    EntityJob findByid(int id);
}
