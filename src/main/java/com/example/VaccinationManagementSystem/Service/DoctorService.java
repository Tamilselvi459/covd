package com.example.VaccinationManagementSystem.Service;

import com.example.VaccinationManagementSystem.Exception.DoctorAlreayExistsException;
import com.example.VaccinationManagementSystem.Exception.EmailIdEmptyException;
import com.example.VaccinationManagementSystem.Repositry.DoctorRepository;
import com.example.VaccinationManagementSystem.models.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    public String addDoc(Doctor doctor) throws EmailIdEmptyException, DoctorAlreayExistsException {

        if(doctor.getEmailId() == null){
            throw new EmailIdEmptyException("Email  id is mandatory");
        }
        if(doctorRepository.findByEmailId(doctor.getEmailId()) != null){
            throw new DoctorAlreayExistsException("This email is already exists");
        }
        doctorRepository.save(doctor);
        return "doctor added successfully";
    }
}
