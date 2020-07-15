package com.college.com.collegeThings.Repository;


import com.college.com.collegeThings.models.University;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UniveristyRepository extends CrudRepository<University,Integer> {

    Optional<University>  findById(Integer id);

}
