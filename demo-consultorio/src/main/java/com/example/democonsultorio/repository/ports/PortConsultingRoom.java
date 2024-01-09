package com.example.democonsultorio.repository.ports;

import com.example.democonsultorio.model.entities.ConsultingRoomModel;
import com.example.democonsultorio.model.entities.DoctorModel;

public interface PortConsultingRoom extends BaseCrudPort<ConsultingRoomModel, Long> {


    Iterable<ConsultingRoomModel>findAll();
}
