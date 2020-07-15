package com.college.com.collegeThings.service;

import com.college.com.collegeThings.Repository.UniveristyRepository;
import com.college.com.collegeThings.models.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UniversityService {

    @Autowired
    UniveristyRepository univeristyRepository;

    public University getUnversityById(int id) {

        if(univeristyRepository.findById(id).isPresent()){
          return univeristyRepository.findById(id).get();
        }

        return null;
    }

    public void postUniversityDetails(University university) {
        univeristyRepository.save(university);
    }
}
