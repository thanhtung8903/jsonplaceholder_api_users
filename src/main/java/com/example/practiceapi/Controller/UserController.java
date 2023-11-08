package com.example.practiceapi.Controller;

import com.example.practiceapi.entity.User;
import com.example.practiceapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String findAll(Model theModel) {
        List<User> theUsers = userService.findAll();
        theModel.addAttribute("users", theUsers);
        return "list_users";
    }

    @GetMapping("/users/{id}")
    public String findById(@PathVariable int id, Model theModel) {
        User theUser = userService.findById(id);
        theModel.addAttribute("users", theUser);
        return "list_users";
    }



}
