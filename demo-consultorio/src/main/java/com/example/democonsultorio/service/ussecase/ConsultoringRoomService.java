package com.example.democonsultorio.service.ussecase;

import com.example.democonsultorio.model.entities.ConsultingRoomModel;
import com.example.democonsultorio.model.entities.DoctorModel;

import java.util.List;

public interface ConsultoringRoomService {

    public List<ConsultingRoomModel> findAll();
}
