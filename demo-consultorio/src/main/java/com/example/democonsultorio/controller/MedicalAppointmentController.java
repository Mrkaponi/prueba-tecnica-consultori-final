package com.example.democonsultorio.controller;

import com.example.democonsultorio.model.entities.MedicalAppointmentModel;
import com.example.democonsultorio.service.ussecase.ConsultoringRoomService;
import com.example.democonsultorio.service.ussecase.DoctorService;
import com.example.democonsultorio.service.ussecase.MedicalAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/citas")
public class MedicalAppointmentController {

    @Autowired
    private MedicalAppointmentService medicalAppointmentService;
    @Autowired
    private ConsultoringRoomService consultoringRoomService;
    @Autowired
    private DoctorService doctorService;


    @GetMapping
    public String mostrarFormulario(Model model) {
        model.addAttribute("medicalAppointment", new MedicalAppointmentModel());
        model.addAttribute("doctors", doctorService.findAll());
        model.addAttribute("consultingRooms", consultoringRoomService.findAll());
        model.addAttribute("listMedical", medicalAppointmentService.findAll());
        return "index";
    }

    @PostMapping("/guardar")
    public String guardarCita(@ModelAttribute MedicalAppointmentModel medicalAppointment) {
        medicalAppointmentService.save(medicalAppointment);
        return "redirect:/citas";
    }
}
