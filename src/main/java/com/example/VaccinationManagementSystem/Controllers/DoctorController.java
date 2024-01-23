package com.example.VaccinationManagementSystem.Controllers;

import com.example.VaccinationManagementSystem.Exception.DoctorAlreayExistsException;
import com.example.VaccinationManagementSystem.Exception.EmailIdEmptyException;
import com.example.VaccinationManagementSystem.Service.DoctorService;
import com.example.VaccinationManagementSystem.models.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @PostMapping("/adddoctor")
    public String addDoc(@RequestBody Doctor doctor) throws EmailIdEmptyException, DoctorAlreayExistsException {


        try{
            String response = doctorService.addDoc(doctor);
            return response;
        }catch(Exception ex) {
            return ex.getMessage();
        }

    }
}
