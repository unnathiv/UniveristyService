package com.college.com.collegeThings.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class University {

    @Id
    private int univeristyId;
    private String universityName;
    private String universityAddress;
    private String universityStudent;

    public int getUniversityId() {
        return univeristyId;
    }

    public String getUniversityStudent() {
        return universityStudent;
    }

    public void setUniversityStudent(String universityStudent) {
        this.universityStudent = universityStudent;
    }

    public void setUniversityId(int univeristyId) {
        this.univeristyId = univeristyId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityId=" + univeristyId +
                ", universityName='" + universityName + '\'' +
                ", universityAddress='" + universityAddress + '\'' +
                ", universityStudent='" + universityStudent + '\'' +
                '}';
    }
}
