package com.example.democonsultorio.service.ussecase;

import com.example.democonsultorio.model.entities.MedicalAppointmentModel;

import java.util.List;

public interface MedicalAppointmentService {

     MedicalAppointmentModel save(MedicalAppointmentModel model);
     public List<MedicalAppointmentModel> findAll();
}
