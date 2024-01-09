package com.example.democonsultorio.repository.Jpa;

import com.example.democonsultorio.model.entities.DoctorModel;
import com.example.democonsultorio.model.entities.MedicalAppointmentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface DoctorModelRepository extends JpaRepository<DoctorModel, Long> {
    List<DoctorModel> findAll();


}