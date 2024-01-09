package com.example.democonsultorio.repository.ports;

import com.example.democonsultorio.model.entities.DoctorModel;
import com.example.democonsultorio.model.entities.MedicalAppointmentModel;

import java.util.List;

public interface PortDoctor extends BaseCrudPort<DoctorModel, Long> {

    List<DoctorModel> findAll();
}
