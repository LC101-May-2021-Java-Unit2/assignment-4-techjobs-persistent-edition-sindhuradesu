package org.launchcode.techjobs.persistent.models.data;

//import org.springframework.data.repository.crudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployerRepository {


    Optional findById(int employerId);

    Object findAll();
}
