package com.example.VaccinationManagementSystem.Service;

import com.example.VaccinationManagementSystem.Repositry.DoseRepository;
import com.example.VaccinationManagementSystem.Repositry.UserRepository;
import com.example.VaccinationManagementSystem.models.Dose1;
import com.example.VaccinationManagementSystem.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DoseService {

    @Autowired
    DoseRepository doserepository;

    @Autowired
    UserRepository userRepository;


    public String givedose1(String doseid, Integer userId) {

        User user = userRepository.findById(userId).get();
        Dose1 dose1 = new Dose1();
        dose1.setDoseId(doseid);
        dose1.setUser(user);
        userRepository.save(user);
     //   doserepository.save(dose1);
        return "dose1 added successfully";
    }

    public Date getvaccdate(int userid) {
       User user =  userRepository.findById(userid).get();
       Dose1 dose1 = user.getDose1();
       return dose1.getVaccinationDate();

    }
}
