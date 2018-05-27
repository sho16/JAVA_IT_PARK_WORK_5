package service.services;

import service.forms.UserForm;

import java.util.List;

public interface UsersService {
    List<String> getAllNames();

    void addUser(UserForm user);
}