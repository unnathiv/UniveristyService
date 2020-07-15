package com.college.com.collegeThings.controller;

import com.college.com.collegeThings.models.University;
import com.college.com.collegeThings.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "university")
public class UniversityController {

    @Autowired
    UniversityService universityService;

    @GetMapping("/firstPage")
    public String universityFirstPage(){
        return "University first page";
    }

    @GetMapping("/universityDetails/{id}")
    public University getUniversityById(@PathVariable int id){
         return universityService.getUnversityById(id);

    }

    @PostMapping("/addUniversityDetails")
    public void postUniversityDetails(@RequestBody University university){
        universityService.postUniversityDetails(university);
    }

}
