package com.example.VaccinationManagementSystem.Service;

import com.example.VaccinationManagementSystem.Exception.VaccinationAddressNotFound;
import com.example.VaccinationManagementSystem.Repositry.VaccinationRepository;
import com.example.VaccinationManagementSystem.models.Vaccinationcenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccinationService {
    @Autowired
    VaccinationRepository vaccinationRepository;

    public static String addcenter(Vaccinationcenter vaccinationcenter) throws VaccinationAddressNotFound {

        if(vaccinationcenter.getAddress() == null)

    }
}
