package com.example.VaccinationManagementSystem.Controllers;

import com.example.VaccinationManagementSystem.Service.DoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/dose1")
public class DoseController {

    @Autowired
    DoseService doseService;


    @PostMapping("/givedose1")
    public String givedose1(@RequestParam("doseId") String doseid , @RequestParam("userId") Integer userId){
        return doseService.givedose1(doseid , userId);
    }

    @GetMapping("/getvaccdate")
    public Date getvaccdate (@RequestParam("UserId") int userid){

        return doseService.getvaccdate(userid);
    }
}
