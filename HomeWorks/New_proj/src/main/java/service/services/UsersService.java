package service.services;

import service.forms.UserForm;
import service.dto.UsersDto;

import java.util.List;

public interface UsersService {

    List<UsersDto> getAllUsersDump();
    List<String> getAllNames();
    //добавили фамилию
    List<String> getAllSurname();


    void addUser(UserForm user);

   //List<String> getAllHotels();

}