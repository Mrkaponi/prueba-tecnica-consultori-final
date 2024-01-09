package com.example.democonsultorio.service;

import com.example.democonsultorio.model.entities.DoctorModel;
import com.example.democonsultorio.repository.repositories.DoctorRepository;
import com.example.democonsultorio.service.ussecase.DoctorService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DoctorImp implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<DoctorModel> findAll() {

        return doctorRepository.findAll();
    }

    @PostConstruct
    public void initializeData() {
        insertDoctors();
    }

    private void insertDoctors() {
        System.out.println("isneratno datos");
        List<DoctorModel> doctors = Arrays.asList(
                new DoctorModel("Dr. John", "Doe", "Smith", "Cardiologist"),
                new DoctorModel("Dr. Mary", "Johnson", "Lee", "Pediatrician"),
                new DoctorModel("Dr. Robert", "Williams", "Brown", "Orthopedic Surgeon"),
                new DoctorModel("Dr. Emily", "Davis", "Taylor", "Dermatologist"),
                new DoctorModel("Dr. Michael", "Miller", "Jones", "Ophthalmologist")
        );

        doctorRepository.saveAll(doctors);
    }
}
