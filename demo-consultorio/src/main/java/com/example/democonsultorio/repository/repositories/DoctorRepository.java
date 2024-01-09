package com.example.democonsultorio.repository.repositories;

import com.example.democonsultorio.model.entities.DoctorModel;
import com.example.democonsultorio.repository.Jpa.DoctorModelRepository;
import com.example.democonsultorio.repository.ports.PortDoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DoctorRepository implements PortDoctor {

    @Autowired
    private DoctorModelRepository doctorModelRepository;

    @Override
    public DoctorModel saveOrUpdate(DoctorModel object) {
        return doctorModelRepository.save(object);
    }

    @Override
    public List<DoctorModel> saveAll(List<DoctorModel> object) {
        return doctorModelRepository.saveAll(object);
    }

    @Override
    public Optional<DoctorModel> findById(Long aLong) {
        return PortDoctor.super.findById(aLong);
    }

    @Override
    public void safeDeleteById(Long aLong) {
        PortDoctor.super.safeDeleteById(aLong);
    }

    @Override
    public List<DoctorModel> findAll() {
        return doctorModelRepository.findAll();
    }
}
