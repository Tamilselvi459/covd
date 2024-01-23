package com.example.VaccinationManagementSystem.Controllers;

import com.example.VaccinationManagementSystem.Exception.VaccinationAddressNotFound;
import com.example.VaccinationManagementSystem.Service.VaccinationService;
import com.example.VaccinationManagementSystem.models.Vaccinationcenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationController {

    @Autowired
    private VaccinationService vaccinationService;

    @PostMapping("/addcenter")
    public ResponseEntity<String> addcenter(@RequestBody Vaccinationcenter vaccinationcenter) throws VaccinationAddressNotFound{
        try{
           String ans =  VaccinationService.addcenter(vaccinationcenter);
           return new ResponseEntity<>(ans , HttpStatus.OK);
        }catch(VaccinationAddressNotFound ex){
            return new ResponseEntity<>(ex.getMessage() , HttpStatus.BAD_REQUEST);
        }

    }
}
