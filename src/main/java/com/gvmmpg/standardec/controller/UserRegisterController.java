package com.gvmmpg.standardec.controller;

import com.gvmmpg.standardec.domain.user.User;
import com.gvmmpg.standardec.domain.user.UserRegister;
import com.gvmmpg.standardec.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public/userRegister")
public class UserRegisterController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String loadUserRegister() {
        return "main/public/userRegister";
    }

    @PostMapping("/user-register")
    public String registerUser(UserRegister data) {
        try {
            var user = new User(data);

            // Check if the email already exists
            boolean exists = userRepository.existsByLogin(user.getLogin());
            if (exists) {return "redirect:/public/userRegister?error=email-exists";}
            /*String plainPassword = user.getPassword();
            String encodedPassword = passwordEncoder.encode(plainPassword);
            user.setPassword(encodedPassword);*/

            userRepository.save(user);

            return "redirect:/public/home";}

        catch (Exception e) {
            System.out.println(e);
            return "redirect:/public/errorPage";}
    }
}
