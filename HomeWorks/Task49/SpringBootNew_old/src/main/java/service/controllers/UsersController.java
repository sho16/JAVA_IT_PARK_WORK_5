package service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import service.services.UsersService;
import service.forms.UserForm;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UsersService service;

    @GetMapping("/users")
    public String getUsersPage(ModelMap model) {
        List<String> names = service.getAllNames();
        model.addAttribute("names", names);
        return "UsersPage";
    }

    @PostMapping("/users")
    public String addUser(UserForm user) {
        service.addUser(user);
        return "redirect:/users";
    }
}