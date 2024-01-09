package com.example.democonsultorio.controller;

import com.example.democonsultorio.model.entities.DoctorModel;
import com.example.democonsultorio.service.ussecase.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {


    @Autowired
    private DoctorService doctorService;


    @GetMapping
    public List<DoctorModel> findAllDoctors() {
        return doctorService.findAll();
    }
}
