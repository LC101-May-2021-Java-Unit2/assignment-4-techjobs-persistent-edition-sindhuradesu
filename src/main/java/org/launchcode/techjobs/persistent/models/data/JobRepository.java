package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Job;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//import org.springframework.data.repository.CrudRepository;

@Repository
public interface JobRepository {
    Iterable<Job> findAll();

    Optional findById(int jobId);

    void save(Job newJob);
}
