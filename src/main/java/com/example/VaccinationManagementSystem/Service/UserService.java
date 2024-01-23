package com.example.VaccinationManagementSystem.Service;

import com.example.VaccinationManagementSystem.Repositry.UserRepository;
import com.example.VaccinationManagementSystem.RequestDTO.updateEmailDto;
import com.example.VaccinationManagementSystem.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public  String addUser(User user) {
          userRepository.save(user);
        return "User added successfully";
    }

    public String updateEmail(updateEmailDto updateemail) {
        int id = updateemail.getUserId();
        User user = userRepository.findById(id).get();
        String email = updateemail.getNewEmailId();
        user.setEmailId(email);
        userRepository.save(user);
        return "email has changed successfully";

    }
}
