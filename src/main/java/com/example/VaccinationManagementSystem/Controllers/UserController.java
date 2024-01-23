package com.example.VaccinationManagementSystem.Controllers;

import com.example.VaccinationManagementSystem.RequestDTO.updateEmailDto;
import com.example.VaccinationManagementSystem.Service.UserService;
import com.example.VaccinationManagementSystem.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userservice;

    @PostMapping("/adduser")
    public String addUser(@RequestBody User user){

        return userservice.addUser(user);

    }
    @PutMapping("/updateEmail")
    public String updateEmail(@RequestBody updateEmailDto updateemail){
        return userservice.updateEmail(updateemail);
    }


}
